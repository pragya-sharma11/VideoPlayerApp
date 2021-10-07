package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView v;
    MediaController m;
    Button b;
    boolean play = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.videoView);
        m = new MediaController(this);
        b = findViewById(R.id.button);
        v.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.a);
        v.setMediaController(m);
        m.setAnchorView(v);
        v.start();

    }
}