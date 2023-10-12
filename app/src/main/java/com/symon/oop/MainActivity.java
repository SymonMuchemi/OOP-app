package com.symon.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText grossIncome;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.calculate_btn);

        button.setOnClickListener(view -> {
            Float netIncome = getIncome();

            Intent  intent= new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("net", netIncome);

            startActivity(intent);
        });
    }

    float getIncome(){

        float amount, netPay;
        grossIncome = findViewById(R.id.grossIncome);

        amount = Float.parseFloat(grossIncome.getText().toString());
        netPay = amount - (amount * 0.1f);

        return netPay;
    }
}