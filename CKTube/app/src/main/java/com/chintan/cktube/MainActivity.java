package com.chintan.cktube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.race);
        MediaController mediaController = new MediaController(this);
        videoPlayer.setMediaController(mediaController);
        mediaController.setAnchorView(videoPlayer);
        videoPlayer.start();
    }
}