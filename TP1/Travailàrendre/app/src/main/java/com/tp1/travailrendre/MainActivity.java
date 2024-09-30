package com.tp1.travailrendre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText fullname, email, phone, adresse;
    Spinner ville;
    Button envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullname = findViewById(R.id.nom);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        adresse = findViewById(R.id.adresse);
        ville = findViewById(R.id.ville);
        envoyer = findViewById(R.id.envoyer);
        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Screen2Activity.class);
                intent.putExtra("fullname", fullname.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("adresse", adresse.getText().toString());
                intent.putExtra("ville", ville.getSelectedItem().toString());

                startActivity(intent);
            }
        });
    }
}