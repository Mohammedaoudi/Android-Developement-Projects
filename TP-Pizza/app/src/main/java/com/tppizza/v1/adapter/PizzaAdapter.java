package com.tppizza.v1.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tppizza.v1.R;
import com.tppizza.v1.beans.Produit;
import com.tppizza.v1.service.ProduitService;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    List<Produit> produits;
    private LayoutInflater inflater;
    private ProduitService ps; // Reference to the ProduitService

    public PizzaAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ps = ProduitService.getInstance(); // Get instance of ProduitService
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.item, null);

        TextView idp = convertView.findViewById(R.id.id);
        TextView nom = convertView.findViewById(R.id.name);
        TextView people = convertView.findViewById(R.id.people);
        TextView time = convertView.findViewById(R.id.time);
        ImageView img = convertView.findViewById(R.id.pizzaimage);
        ImageButton fvBtn = convertView.findViewById(R.id.fvBtn);

        // Populate the pizza details
        Produit produit = produits.get(position);
        idp.setText(produit.getId() + "");
        nom.setText(produit.getNom());
        time.setText(produit.getDuree() + " min");
        img.setImageResource(produit.getPhoto());
        people.setText(produit.getNbrIngredients() + "");

        // Set the favorite button icon based on the pizza's favorite status
        if (produit.isFav()) {
            fvBtn.setImageResource(R.drawable.baseline_favorite_red_24); // Set to favorited icon
        } else {
            fvBtn.setImageResource(R.drawable.baseline_favorite_24); // Set to non-favorited icon
        }

        // Handle favorite button click
        fvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle favorite status
                if (produit.isFav()) {
                    produit.setFav(false);
                    ps.removeFromFavorites(produit); // Call to remove from favorites
                    fvBtn.setImageResource(R.drawable.baseline_favorite_24); // Not favorited
                    Toast.makeText(v.getContext(), produit.getNom() + " removed from favorites", Toast.LENGTH_SHORT).show();
                } else {
                    produit.setFav(true);
                    ps.addToFavorites(produit); // Call to add to favorites
                    fvBtn.setImageResource(R.drawable.baseline_favorite_red_24); // Favorited
                    Toast.makeText(v.getContext(), produit.getNom() + " added to favorites", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return convertView;
    }
}
