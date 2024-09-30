package com.tp1.exo3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView res1, res2, qst1Field, qst2Field;
    Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        retour = findViewById(R.id.retour);
        qst1Field = findViewById(R.id.qst1);
        qst2Field = findViewById(R.id.qst2);
        res1 = findViewById(R.id.res1);
        res2 = findViewById(R.id.res2);


        res1.setText(getIntent().getStringExtra("res1"));
        res2.setText(getIntent().getStringExtra("res2"));

        qst1Field.setText(getIntent().getStringExtra("qst1"));
        qst2Field.setText(getIntent().getStringExtra("qst2"));

        retour.setOnClickListener(v -> finish());
    }
}
