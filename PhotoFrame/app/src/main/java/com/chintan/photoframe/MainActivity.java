    package com.chintan.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        String[] names = {"Sky","MSM","PSM","MSM"};
    ImageButton prev,next;
    ImageView pic;
    TextView status;
    int currentImage=1;

    public void prev(View view){
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        if(currentImage == 1){
            currentImage = 4;
        }else{
            currentImage = currentImage - 1;
        }
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        status.setText(names[currentImage-1]);
    }

    public void next(View view){
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        if(currentImage == 4){
            currentImage = 1;
        }else{
            currentImage = currentImage + 1;
        }
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        status.setText(names[currentImage-1]);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        status  = findViewById(R.id.status);
    }
}