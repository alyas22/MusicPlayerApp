package com.example.android.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        TextView song1 = (TextView) findViewById (R.id.song1);
        TextView song2 = (TextView) findViewById (R.id.song2);
        TextView song3 = (TextView) findViewById (R.id.song3);
        // Set a click listener on that View
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent song1Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(song1Intent);
            }
        });
        // Set a click listener on that View
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent song2Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(song2Intent);
            }
        });
        // Set a click listener on that View
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent song3Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(song3Intent);
            }
        });
    }
}
