package com.example.phuquytran_300303518_paperb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class InterestActivity extends AppCompatActivity {

    int number1;
    int number2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);



        final EditText txtNumber1 = (EditText)findViewById(R.id.txtNumber1);
        final EditText txtNumber2 = (EditText)findViewById(R.id.txtNumber2);
        Button btnMultiply = (Button)findViewById(R.id.btnMultiply);

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    number1 = Integer.parseInt(txtNumber1.getText().toString());
                    number2 = Integer.parseInt(txtNumber2.getText().toString());
                    result = number1 * number2;

                    Toast.makeText(InterestActivity.this, "The product is " + result, Toast.LENGTH_LONG).show();
                }
                catch (Exception ex){
                    Toast.makeText(InterestActivity.this,"Please enter numbers only!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}