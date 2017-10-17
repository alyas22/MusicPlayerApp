package com.example.android.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowPlaying = (TextView) findViewById (R.id.player_button);
        TextView nowPlaylist = (TextView) findViewById (R.id.playlist_button);
        TextView nowLibrary = (TextView) findViewById (R.id.library_button);
        TextView nowSearch = (TextView) findViewById (R.id.search_button);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
        // Set a click listener on that View
        nowPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistActivity}
                Intent nowPlaylistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                // Start the new activity
                startActivity(nowPlaylistIntent);
            }
        });
        // Set a click listener on that View
        nowLibrary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LibraryActivity}
                Intent nowLibraryIntent = new Intent(MainActivity.this, LibraryActivity.class);

                // Start the new activity
                startActivity(nowLibraryIntent);
            }
        });
        // Set a click listener on that View
        nowSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent nowSearchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(nowSearchIntent);
            }
        });
    }
}
