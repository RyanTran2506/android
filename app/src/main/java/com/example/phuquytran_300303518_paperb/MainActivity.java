package com.example.phuquytran_300303518_paperb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton rdbInterest = (RadioButton)findViewById(R.id.rdbInterest);
        final RadioButton rdbPhone = (RadioButton)findViewById(R.id.rdbPhone);
        Button btnGo = (Button)findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdbInterest.isChecked()){
                    startActivity(new Intent(MainActivity.this, InterestActivity.class));
                }
                else{
                    startActivity(new Intent(MainActivity.this, PhoneActivity.class));
                }
            }
        });
    }
}