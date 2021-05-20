package com.chintan.dbdemo.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.chintan.dbdemo.R;

public class displayContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Rname");
        String phone = intent.getStringExtra("Rphone");

        TextView nameTV = findViewById(R.id.display_name);
        nameTV.setText(name);

        TextView phoneTV = findViewById(R.id.display_phone);
        phoneTV.setText(phone);
    }
}