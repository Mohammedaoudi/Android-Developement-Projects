package com.tp4.cars.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.tp4.cars.R;
import com.tp4.cars.beans.Car;
import com.tp4.cars.service.CarService;

import java.util.ArrayList;
import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> implements Filterable {
    private List<Car> cars;
    private List<Car> carsFilter;
    private NewFilter mfilter;

    private Context context;

    public CarAdapter(List<Car> cars, Context context) {
        this.cars = cars;
        this.context = context;
        mfilter = new NewFilter(this);
        carsFilter = new ArrayList<>();
        carsFilter.addAll(cars);
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(this.context).inflate(R.layout.item, viewGroup, false);
        final CarViewHolder holder = new CarViewHolder(v);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popup = LayoutInflater.from(context).inflate(R.layout.star_edit_item, null,
                        false);
                final ImageView img = popup.findViewById(R.id.img);
                final RatingBar bar = popup.findViewById(R.id.ratingBar);
                final TextView ids = popup.findViewById(R.id.id);
                Bitmap bitmap =
                        ((BitmapDrawable)((ImageView)v.findViewById(R.id.img)).getDrawable()).getBitmap();
                img.setImageBitmap(bitmap);
                bar.setRating(((RatingBar)v.findViewById(R.id.stars)).getRating());
                ids.setText(((TextView)v.findViewById(R.id.id)).getText().toString());
                AlertDialog dialog = new AlertDialog.Builder(context)
                        .setTitle("Notez : ")
                        .setMessage("Donner une note entre 1 et 5 :")
                        .setView(popup)
                        .setPositiveButton("Valider", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                float s = bar.getRating();
                                int id = Integer.parseInt(ids.getText().toString());
                                Car car = CarService.getInstance().findById(id);
                                Log.d("old",car.getName() +"  " + car.getStar());

                                car.setStar(s);
                                CarService.getInstance().update(car);
                                Log.d("new",car.getName() +"  " + car.getStar());
                                notifyItemChanged(holder.getAdapterPosition());
                            }
                        })
                        .setNegativeButton("Annuler", null)
                        .create();
                dialog.show();
            }
        });
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {

        Glide.with(context)
                .asBitmap()
                .load(carsFilter.get(position).getImg())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.image);
        holder.name.setText(carsFilter.get(position).getName().toUpperCase());
        holder.id.setText(carsFilter.get(position).getId()+"");
        holder.stars.setRating(carsFilter.get(position).getStar());
    }

    @Override
    public int getItemCount() {
        return carsFilter.size();
    }

    @Override
    public Filter getFilter() {
        return mfilter;
    }

    public class CarViewHolder extends RecyclerView.ViewHolder {
       TextView id, name;
       ImageView image;
       RatingBar stars;
       RelativeLayout parent;

        public CarViewHolder(@NonNull View itemView) {
            super(itemView);
            id= itemView.findViewById(R.id.id);
            name= itemView.findViewById(R.id.name);
            image= itemView.findViewById(R.id.img);
            stars= itemView.findViewById(R.id.stars);
            parent = itemView.findViewById(R.id.parent);
        }
    }

    public class NewFilter extends Filter {
        public RecyclerView.Adapter mAdapter;

        public NewFilter(RecyclerView.Adapter mAdapter) {
            super();
            this.mAdapter = mAdapter;
        }

        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            carsFilter.clear();
            final FilterResults results = new FilterResults();
            if (charSequence.length() == 0) {
                carsFilter.addAll(cars);
            } else if(charSequence.equals("5stars")){
                final String filterPattern = charSequence.toString().toLowerCase().trim();
                for (Car c : cars) {
                    if (c.getStar() == 5) {
                        carsFilter.add(c);
                    }
                }
            }
            else {
                final String filterPattern = charSequence.toString().toUpperCase().trim();
                for (Car p : cars) {
                    if (p.getName().toUpperCase().startsWith(filterPattern)) {
                        carsFilter.add(p);
                    }
                }
            }
            results.values = carsFilter;
            results.count = carsFilter.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            carsFilter = (List<Car>) filterResults.values;
            this.mAdapter.notifyDataSetChanged();
        }
    }
}
