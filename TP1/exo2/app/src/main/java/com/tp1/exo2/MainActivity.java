package com.tp1.exo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextInputEditText sur, pic;
    CheckBox piscine;
    Button calcul;
    TextView base, supp, total;
    float surVal, picVal, baseVal, suppVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sur = findViewById(R.id.surface);
        pic = findViewById(R.id.nbrPiece);
        piscine = findViewById(R.id.piscine);
        calcul = findViewById(R.id.calculer);
        base = findViewById(R.id.base);
        supp = findViewById(R.id.supp);
        total = findViewById(R.id.total);

        calcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Get input values inside the onClickListener
                    String surface = Objects.requireNonNull(sur.getText()).toString();
                    String pieces = pic.getText().toString();

                    // Check for empty input values
                    if (surface.isEmpty() || pieces.isEmpty()) {
                        Toast.makeText(MainActivity.this, "Veuillez entrer des valeurs valides", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    // Parse the input values
                    surVal = Float.parseFloat(surface);
                    picVal = Float.parseFloat(pieces);

                    // Calculate base and supplementary values
                    baseVal = surVal * 2;
                    suppVal = picVal * 50;

                    if (piscine.isChecked()) {
                        suppVal += 100;
                    }

                    // Set the result in the TextViews
                    base.setText("Impot de base: " + baseVal);
                    supp.setText("Impot supplémentaire: " + suppVal);
                    total.setText("Impot total: " + (baseVal + suppVal));

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Erreur: " + e, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
