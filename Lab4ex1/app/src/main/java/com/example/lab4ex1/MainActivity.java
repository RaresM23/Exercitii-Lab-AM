package com.example.lab4ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNr1, editTextNr2;
    Button addBtn, subBtn, mulBtn, divBtn;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNr1 = findViewById(R.id.editTextNr1);
        editTextNr2 = findViewById(R.id.editTextNr2);
        addBtn = findViewById(R.id.add_Btn);
        subBtn = findViewById(R.id.sub_Btn);
        mulBtn = findViewById(R.id.mul_Btn);
        divBtn = findViewById(R.id.div_Btn);
        textViewResult = findViewById(R.id.textViewResult);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation('+');
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation('-');
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation('*');
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation('/');
            }
        });
    }

    private void performOperation(char operator) {
        double num1 = Double.parseDouble(editTextNr1.getText().toString());
        double num2 = Double.parseDouble(editTextNr2.getText().toString());
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else
                    textViewResult.setText("Error: Division by zero");
                break;
        }

        textViewResult.setText("Result: " + result);
    }
}
