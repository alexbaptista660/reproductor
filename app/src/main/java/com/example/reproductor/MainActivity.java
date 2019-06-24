package com.example.reproductor;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    VideoView video1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        video1 = findViewById(R.id.videoView);
        video1.setMediaController(new MediaController(this));
        String vid = "android.resource://"+getPackageName()+"/"+R.raw.marvel ;
        video1.setVideoURI(Uri.parse(vid));
        video1.start();

        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View v) {
                reproducir1(v);
            }
        });

        findViewById(R.id.imageView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproducir2(v);
            }
        });

        findViewById(R.id.imageView3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproducir3(v);
            }
        });

        findViewById(R.id.imageView4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reproducir4(v);
            }
        });

    }
    public void reproducir1(View View)
    {
        video1.stopPlayback();
        String vid = "android.resource://"+getPackageName()+"/"+R.raw.marvel ;
        video1.setVideoURI(Uri.parse(vid));
        video1.start();
    }
    public void reproducir2(View View)
    {
        video1.stopPlayback();

        String vid = "android.resource://"+getPackageName()+"/"+R.raw.ichigo_vs_aizen ;
        video1.setVideoURI(Uri.parse(vid));
        video1.start();
    }
    public void reproducir3(View View)
    {
        String vid = "android.resource://"+getPackageName()+"/"+R.raw.te_voy_a_amar ;
        video1.setVideoURI(Uri.parse(vid));
        video1.start();
    }
    public void reproducir4(View View)
    {
        String vid = "android.resource://"+getPackageName()+"/"+R.raw.avengers_end_game ;
        video1.setVideoURI(Uri.parse(vid));
        video1.start();
    }
}
