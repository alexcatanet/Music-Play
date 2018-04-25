package com.example.android.musicplay.Chill_Album;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.android.musicplay.Chill_Activity.Chill_Activity;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_10;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_11;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_12;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_2;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_3;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_4;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_5;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_6;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_7;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_8;
import com.example.android.musicplay.Chill_Activity.Chill_Activity_9;
import com.example.android.musicplay.R;

public class Chill_Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chill_album);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        final ImageView chillImageAlbum = findViewById(R.id.chill_image_1);
        chillImageAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum = new Intent(Chill_Album.this, Chill_Activity.class);
                startActivity(chillImageAlbum);
            }
        });

        ImageView chillImageAlbum2 = findViewById(R.id.chill_image_9);
        chillImageAlbum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum2 = new Intent(Chill_Album.this, Chill_Activity_2.class);
                startActivity(chillImageAlbum2);
            }
        });

        ImageView chillImageAlbum3 = findViewById(R.id.chill_image_2);
        chillImageAlbum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum3 = new Intent(Chill_Album.this, Chill_Activity_3.class);
                startActivity(chillImageAlbum3);
            }
        });
        ImageView chillImageAlbum4 = findViewById(R.id.chill_image_3);
        chillImageAlbum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum4 = new Intent(Chill_Album.this, Chill_Activity_4.class);
                startActivity(chillImageAlbum4);
            }
        });
        ImageView chillImageAlbum5 = findViewById(R.id.chill_image_4);
        chillImageAlbum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum5 = new Intent(Chill_Album.this, Chill_Activity_5.class);
                startActivity(chillImageAlbum5);
            }
        });
        ImageView chillImageAlbum6 = findViewById(R.id.chill_image_5);
        chillImageAlbum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum6 = new Intent(Chill_Album.this, Chill_Activity_6.class);
                startActivity(chillImageAlbum6);
            }
        });
        ImageView chillImageAlbum7 = findViewById(R.id.chill_image_7);
        chillImageAlbum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum7 = new Intent(Chill_Album.this, Chill_Activity_7.class);
                startActivity(chillImageAlbum7);
            }
        });
        ImageView chillImageAlbum8 = findViewById(R.id.chill_image_8);
        chillImageAlbum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum8 = new Intent(Chill_Album.this, Chill_Activity_8.class);
                startActivity(chillImageAlbum8);
            }
        });
        ImageView chillImageAlbum9 = findViewById(R.id.chill_image_10);
        chillImageAlbum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum9 = new Intent(Chill_Album.this, Chill_Activity_9.class);
                startActivity(chillImageAlbum9);
            }
        });
        ImageView chillImageAlbum10 = findViewById(R.id.chill_image_11);
        chillImageAlbum10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum10 = new Intent(Chill_Album.this, Chill_Activity_10.class);
                startActivity(chillImageAlbum10);
            }
        });
        ImageView chillImageAlbum11 = findViewById(R.id.chill_image_12);
        chillImageAlbum11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum11 = new Intent(Chill_Album.this, Chill_Activity_11.class);
                startActivity(chillImageAlbum11);
            }
        });
        ImageView chillImageAlbum12 = findViewById(R.id.chill_image_6);
        chillImageAlbum12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum12 = new Intent(Chill_Album.this, Chill_Activity_12.class);
                startActivity(chillImageAlbum12);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}