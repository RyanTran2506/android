package com.example.phuquytran_300303518_paperb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PhoneActivity extends ListActivity {

    String[] listItems = {"Phu Quy Tran", "", "iPhone", "Samsung"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_phone, R.id.item, listItems));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 2:
                Toast.makeText(this, "Your favorite phone is iPhone", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Your favorite phone is Samsung", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}