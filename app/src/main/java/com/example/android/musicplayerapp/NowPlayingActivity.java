package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    boolean PlayingArrow = false;
    ImageView nowPlayingArrow,nextButton,prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        nowPlayingArrow = (ImageView) findViewById(R.id.play_arrow);
        nowPlayingArrow.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
        if (PlayingArrow) {
            nowPlayingArrow.setImageResource(R.drawable.ic_pause_black_36dp);
            Toast toast = Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT);
            toast.show();
            PlayingArrow = false;
        } else {
            nowPlayingArrow.setImageResource(R.drawable.ic_play_arrow_black_36dp);
            Toast toast = Toast.makeText(getApplicationContext(), "Pause", Toast.LENGTH_SHORT);
            toast.show();
            PlayingArrow = true;
        }
        }
    });
        nextButton = (ImageView) findViewById(R.id.forward);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),"Forward", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        prevButton = (ImageView) findViewById(R.id.backward);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),"Backward", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }}