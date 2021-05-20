package com.chintan.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(35000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("lpg","onTick: I am hero");
            }

            @Override
            public void onFinish() {
                Log.d("lpg","Tata tata bye bye see u");
            }
        }.start();

        //        Task Schedular using Handler and Runnable
        //        final Handler handler = new Handler();
        //        Runnable run = new Runnable() {
        //            @Override
        //            public void run() {
        ////                      code to execute
        //                Toast.makeText(MainActivity.this,"This is toast "+num,Toast.LENGTH_SHORT).show();
        //                num++;
        //                handler.postDelayed(this,1000);
        //            }
        //        };
        //        handler.post(run);




    }
}