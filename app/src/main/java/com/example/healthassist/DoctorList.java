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

public class DoctorList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button doc1 = findViewById(R.id.Btn1); // Assuming button id is calculate_bmi_button
        doc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call1();
            }

        });
        Button doc2 = findViewById(R.id.Btn2); // Assuming button id is calculate_bmi_button
        doc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call2();
            }

        });
        Button doc3 = findViewById(R.id.Btn3); // Assuming button id is calculate_bmi_button
        doc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call3();
            }

        });
    }

    private void call3() {
        String phoneNumber = "tel:07942680474";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(phoneNumber));
        startActivity(intent);
    }

    private void call2() {
        String phoneNumber = "tel:09740116487";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(phoneNumber));
        startActivity(intent);
    }

    private void call1() {
        String phoneNumber = "tel:09980863161";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(phoneNumber));
        startActivity(intent);
    }
}