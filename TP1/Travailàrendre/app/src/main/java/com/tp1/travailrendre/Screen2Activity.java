package com.tp1.travailrendre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen2Activity extends AppCompatActivity {

    private TextView fullname,phone,email,ville,adresse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        fullname = findViewById(R.id.fullname);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        adresse = findViewById(R.id.adresse);
        ville = findViewById(R.id.ville);

        fullname.setText(this.getIntent().getStringExtra("fullname"));
        email.setText(this.getIntent().getStringExtra("email"));
        phone.setText(this.getIntent().getStringExtra("phone"));
        adresse.setText(this.getIntent().getStringExtra("adresse"));
        ville.setText(this.getIntent().getStringExtra("ville"));
    }
}