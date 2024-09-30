package com.tp1.exo1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button toastBtn;
    private int count = 0;
    private int totalCount = -1; // -1 indicates no total count set
    private TextView countDisplay;
    private ExtendedFloatingActionButton dikrButton;
    private AlertDialog dialog;
    private View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastBtn = findViewById(R.id.toast);
        countDisplay = findViewById(R.id.numb);
        dikrButton = findViewById(R.id.dikr);
        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalCount < 0) {
                Toast.makeText(MainActivity.this, "You SAID "+ dikrButton.getText().toString() + " " +count+ " times",Toast.LENGTH_SHORT).show();
            }
                else {
                    Toast.makeText(MainActivity.this, (totalCount-count) + " times left to complete the target",Toast.LENGTH_SHORT).show();
                }}
        });

        createAddTasbeehDialog();
        updateCountDisplay();
    }

    private void createAddTasbeehDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        dialogView = inflater.inflate(R.layout.add_tasbeeh_layout, null);

        Button addButton = dialogView.findViewById(R.id.addtasbeehButton);
        addButton.setOnClickListener(v -> setTasbeeh());

        builder.setView(dialogView);
        dialog = builder.create();
    }

    public void increment(View view) {
        count++;
        updateCountDisplay();
    }

    public void reset(View view) {
        count = 0;
        updateCountDisplay();
    }

    public void addTasbeeh(View view) {
        // Clear previous input
        TextInputEditText newTasbeehInput = dialogView.findViewById(R.id.addTasbeehInput);
        TextInputEditText noOfTimesInput = dialogView.findViewById(R.id.noOfTimesInput);
        newTasbeehInput.setText("");
        noOfTimesInput.setText("");

        dialog.show();
    }

    private void setTasbeeh() {
        TextInputEditText newTasbeehInput = dialogView.findViewById(R.id.addTasbeehInput);
        TextInputEditText noOfTimesInput = dialogView.findViewById(R.id.noOfTimesInput);

        String newTasbeeh = newTasbeehInput.getText().toString();
        if (!newTasbeeh.isEmpty()) {
            dikrButton.setText(newTasbeeh);

            String noOfTimesStr = noOfTimesInput.getText().toString();
            if (!TextUtils.isEmpty(noOfTimesStr)) {
                try {
                    totalCount = Integer.parseInt(noOfTimesStr);
                } catch (NumberFormatException e) {
                    totalCount = -1;
                }
            } else {
                totalCount = -1;
            }

            count = 0;
            updateCountDisplay();
            dialog.dismiss();
        }
    }

    private void updateCountDisplay() {
        if (totalCount > 0) {
            countDisplay.setText(String.format("%d/%d", count, totalCount));
        } else {
            countDisplay.setText(String.valueOf(count));
        }
    }
}