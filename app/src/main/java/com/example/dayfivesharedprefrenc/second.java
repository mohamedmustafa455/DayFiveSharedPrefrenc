package com.example.dayfivesharedprefrenc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView tvName,tvPhone;
    Button btnBack;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName=findViewById(R.id.tv_name_2);
        tvPhone=findViewById(R.id.tv_phone_2);
        btnBack=findViewById(R.id.btnBack);

        preferences=getSharedPreferences("data_profile",0);
        String name=preferences.getString("name","not available");
        String phone=preferences.getString("phone","not available");

        tvName.setText(name);
        tvPhone.setText(phone);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}