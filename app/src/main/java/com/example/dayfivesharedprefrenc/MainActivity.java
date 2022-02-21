package com.example.dayfivesharedprefrenc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnNext ,btnClose;
    EditText edtname,edtphone;
    String name,phone;
    SharedPreferences prefrence;
    Intent outIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClose=findViewById(R.id.btn_close);
        btnNext=findViewById(R.id.btn_next);
        edtname=findViewById(R.id.edt_name);
        edtphone=findViewById(R.id.edt_phone);




        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=edtname.getText().toString();
                phone=edtphone.getText().toString();

                prefrence=getSharedPreferences("data_profile",0);
                SharedPreferences.Editor editor=prefrence.edit();
                editor.putString("name",name);
                editor.putString("phone",phone);
                editor.commit();

                outIntent =new Intent(MainActivity.this,second.class);
                startActivity(outIntent);


            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}