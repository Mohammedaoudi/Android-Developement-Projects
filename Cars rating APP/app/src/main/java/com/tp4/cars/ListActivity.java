package com.tp4.cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import com.tp4.cars.adapter.CarAdapter;
import com.tp4.cars.beans.Car;
import com.tp4.cars.service.CarService;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.widget.Toolbar;


public class ListActivity extends AppCompatActivity {


    private List<Car> cars;
    CarService service;
    private RecyclerView recyclerView;
    private CarAdapter carAdapter=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cars = new ArrayList<>();
        service = CarService.getInstance();
        init();
        recyclerView =findViewById(R.id.recycler_view);
        carAdapter = new CarAdapter(service.findAll(),this);
        recyclerView.setAdapter(carAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new
                                                  SearchView.OnQueryTextListener() {
                                                      @Override
                                                      public boolean onQueryTextSubmit(String query) {
                                                          return true;
                                                      }

                                                      @Override
                                                      public boolean onQueryTextChange(String newText) {
                                                          if (carAdapter != null){
                                                              carAdapter.getFilter().filter(newText);
                                                          }
                                                          return true;
                                                      }
                                                  });return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.share) {
            ShareCompat.IntentBuilder.from(this)
                    .setType("text/plain")
                    .setChooserTitle("Stars")
                    .setText("Stars")
                    .startChooser();
            return true;
        } else if (item.getItemId() == R.id.settings) {
            Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (item.getItemId() == R.id.star5) {
            if (carAdapter != null) {
                carAdapter.getFilter().filter("5stars");
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
        }

        public void init(){
        service.create(new Car("https://th.bing.com/th/id/OIP.6uS3Ki-q8V1WJ1z27YgR9AHaEA?rs=1&pid=ImgDetMain","AUDI RS7",4f));
        service.create(new Car("https://cdn.motor1.com/images/mgl/KPE3N/s1/b-b-audi-rs-q3.jpg","AUDI RSQ3",3.5f));
        service.create(new Car("https://images4.alphacoders.com/123/thumb-1920-1238811.jpg","MAYBACH",5f));
        service.create(new Car("https://th.bing.com/th/id/OIP.IIw5SG1mAygCnEaA1nQb0AHaEK?rs=1&pid=ImgDetMain","TOUAREG",2.7f));
        service.create(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyOTpnJWfk410Okxwf7DwrW_u1lObwvV3zSA&s","Golf 8",2.7f));
        service.create(new Car("data:image/jpeg;base64,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","R4",2.7f));
        service.create(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcPz7bf_hQAGCHwkk2pXl_qjd9D2fWvLhTgw&s","supra mk4",2.7f));
    }


}

