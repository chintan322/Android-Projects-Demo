package com.chintan.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sendNow(View view){
        Toast.makeText(this,"Sending data from app",Toast.LENGTH_SHORT).show();
    }

    public void ReceiveNow(View view){
        Toast.makeText(this,"Receiving data from app",Toast.LENGTH_SHORT).show();
    }

    public void DeleteNow(View view){
        Toast.makeText(this,"Deeting data from app",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}