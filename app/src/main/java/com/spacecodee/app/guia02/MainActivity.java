package com.spacecodee.app.guia02;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private EditText txtNumber1;
    private EditText txtNumber2;
    private TextView txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        Objects.requireNonNull(this.getSupportActionBar()).hide();
        this.txtNumber1 = this.findViewById(R.id.txtNumber1);
        this.txtNumber2 = this.findViewById(R.id.txtNumber2);
        this.txtTotal = this.findViewById(R.id.txtTotal);
    }

    @SuppressLint("SetTextI18n") public void calcSum(View view) {
        String number1 = this.txtNumber1.getText().toString();
        String number2 = this.txtNumber2.getText().toString();

        if (number1.trim().isEmpty() || number2.trim().isEmpty()) {
            this.txtTotal.setText("Error: Empty fields");
            return;
        }
        double num1 = Integer.parseInt(this.txtNumber1.getText().toString());
        double num2 = Integer.parseInt(this.txtNumber2.getText().toString());
        double sum = num1 + num2;
        this.txtTotal.setText(String.valueOf(sum));
    }
}