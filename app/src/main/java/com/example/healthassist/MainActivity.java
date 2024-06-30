package com.example.healthassist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Set up window insets listener
        View mainView = findViewById(R.id.main);
        ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return WindowInsetsCompat.CONSUMED;
        });

        // Set up the button and its click listener
        Button calculateBMIButton = findViewById(R.id.BtnBMI); // Assuming button id is calculate_bmi_button
        calculateBMIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }

        });
        Button Login = findViewById(R.id.BtnAppointment); // Assuming button id is calculate_bmi_button
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }

        });
        Button BtnMapButton = findViewById(R.id.BtnMap);
        BtnMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMaps();
            }
        });
        Button button = findViewById(R.id.buttonOpenDialer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dial number 104
               dialer();
            }
        });

        Button BtnExercise1 = findViewById(R.id.BtnExercise);
        BtnExercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dial number 104
                execte();
            }
        });

    }

    private void login() {
        Intent intent = new Intent(MainActivity.this,Login.class);
        startActivity(intent);
    }

    private void execte() {
        Intent intent = new Intent(MainActivity.this,splashscreenok.class);
        startActivity(intent);
    }

    private void dialer() {
        Intent intent = new Intent(MainActivity.this, DoctorList.class);
        startActivity(intent);
    }

    public void calculateBMI(){
        Intent intent = new Intent(MainActivity.this, BMI.class);
        startActivity(intent);
    }
    public void showMaps(){
        Intent intent = new Intent(MainActivity.this,Map.class);
        startActivity(intent);
    }

}
