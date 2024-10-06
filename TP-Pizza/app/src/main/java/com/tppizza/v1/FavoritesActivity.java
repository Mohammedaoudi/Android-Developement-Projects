package com.tppizza.v1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.tppizza.v1.adapter.PizzaAdapter;
import com.tppizza.v1.beans.Produit;
import com.tppizza.v1.service.ProduitService;

import java.util.List;

public class FavoritesActivity extends AppCompatActivity {

    ListView favoritesList;
    ProduitService ps = ProduitService.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        favoritesList = findViewById(R.id.favorites_list);

        List<Produit> favoriteProducts = ps.getFavorites(); // Implement this method

        PizzaAdapter adapter = new PizzaAdapter(favoriteProducts, this);
        favoritesList.setAdapter(adapter);
    }
}
