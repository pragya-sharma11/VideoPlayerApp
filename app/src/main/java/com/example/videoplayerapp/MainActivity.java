package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
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
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.videoView);
        m = new MediaController(this);
        b = findViewById(R.id.button);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.a);
        v.setVideoURI(uri);
        v.start();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //on clicking button video should start and stop
            }
        });


    }
}