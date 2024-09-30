package com.tp1.exo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView qst1View, qst2View;
    String res1, res2, qst1Label, qst2Label;
    RadioButton un,deux,trois,quatre,oui,non;
    Button quitter, suivant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        qst1View = findViewById(R.id.qst1);
        qst2View = findViewById(R.id.qst2);

        qst1Label = qst1View.getText().toString();
        qst2Label = qst2View.getText().toString();

        un = findViewById(R.id.un);
        deux = findViewById(R.id.deux);
        trois = findViewById(R.id.trois);
        quatre = findViewById(R.id.quatre);
        oui = findViewById(R.id.oui);
        non = findViewById(R.id.non);
        RadioButton[] qst1 = {un, deux, trois, quatre};
        RadioButton[] qst2 = {oui, non};
        quitter = findViewById(R.id.quitter);
        suivant = findViewById(R.id.suivant);

        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (RadioButton answer: qst1){
                    if(answer.isChecked())
                        res1 = answer.getText().toString();
                }
                for (RadioButton answer: qst2){
                    if(answer.isChecked())
                        res2 = answer.getText().toString();
                }

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("res1", res1);
                intent.putExtra("res2", res2);
                intent.putExtra("qst1", qst1Label);
                intent.putExtra("qst2", qst2Label);


                startActivity(intent);
            };
        });
        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}