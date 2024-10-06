package com.tppizza.v1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tppizza.v1.beans.Produit;
import com.tppizza.v1.service.ProduitService;

public class DetailsPizza extends AppCompatActivity {
    int idp;
    TextView prep, ingred, nom, desc;
    ImageView img;
    private ProduitService ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);

        idp = getIntent().getIntExtra("idp", -1);

        ps = ProduitService.getInstance();
        prep = findViewById(R.id.prep);
        ingred = findViewById(R.id.ingred);
        nom = findViewById(R.id.nom);
        desc = findViewById(R.id.desc);
        img = findViewById(R.id.image);

        Produit p = ps.findById(idp);
        if (p != null) {
            nom.setText(p.getNom());
            prep.setText(p.getPreparation());
            desc.setText(p.getDescription());
            ingred.setText(p.getDetailsIngred());
            img.setImageResource(p.getPhoto());
        }
    }

    public void onShareClick(View view) {
        String pizzaName = nom.getText().toString();
        String pizzaDescription = desc.getText().toString();
        String pizzaIngredients = ingred.getText().toString();
        String pizzaPreparation = prep.getText().toString();

        String shareBody = "Quel recette de pizza !!\n\n" +
                "🍕 *" + pizzaName + "*\n\n" +
                "*Description:*\n" + pizzaDescription + "\n\n" +
                "*Ingredients:*\n" + pizzaIngredients + "\n\n" +
                "*Preparation:*\n" + pizzaPreparation;

        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, pizzaName + " Recette");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);

        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
