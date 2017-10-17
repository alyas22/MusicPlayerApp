package com.example.android.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        TextView artist = (TextView) findViewById (R.id.artist);
        TextView album = (TextView) findViewById (R.id.album);
        TextView song = (TextView) findViewById (R.id.song);
        // Set a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistIntent = new Intent(LibraryActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });
        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumIntent = new Intent(LibraryActivity.this, AlbumsActivity.class);
                // Start the new activity
                startActivity(albumIntent);
            }
        });
        // Set a click listener on that View
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songIntent = new Intent(LibraryActivity.this, SongsActivity.class);
                // Start the new activity
                startActivity(songIntent);
            }
        });
        TextView buy = (Button) findViewById (R.id.Buy_button);
        // Set a click listener on that View
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),"Open Android Pay", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
