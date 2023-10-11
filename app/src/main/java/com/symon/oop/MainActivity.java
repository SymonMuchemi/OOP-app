package com.symon.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student = new Student(7857, "Simon", "MAlE");

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);

        textView.setText(student.Display());

        student.ID = Integer.parseInt(editText.getText().toString());


        button.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, student.name, Toast.LENGTH_LONG).show();
        });
    }
    Integer Add(Integer a, Integer b){
        return a + b;
    }
}