package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView counterText;
    private Button countButton;
    private Button toastButton;

    private int counterValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.CounterText);
        countButton = findViewById(R.id.CountButton);
        toastButton = findViewById(R.id.ToastButton);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue++;
                counterText.setText(String.valueOf(counterValue));
            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This is a toast message", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
