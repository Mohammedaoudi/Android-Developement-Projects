package com.tp1.exo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toast;
    private TextView text;

    private Button count;
    private int counter=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast=findViewById(R.id.taostBtn);
        count=findViewById(R.id.count);
        text=findViewById(R.id.zero);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Toast",Toast.LENGTH_SHORT).show();
            }
        });
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                text.setText(String.valueOf(counter));

            }
        });
    }
}