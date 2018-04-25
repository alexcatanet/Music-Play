package com.example.android.musicplay.Pop_Album;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.android.musicplay.Pop_Activity.Pop_Activity;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_10;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_11;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_12;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_2;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_3;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_4;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_5;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_6;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_7;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_8;
import com.example.android.musicplay.Pop_Activity.Pop_Activity_9;
import com.example.android.musicplay.R;

public class Pop_Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_album);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        final ImageView ImageAlbum = findViewById(R.id.pop_image);
        ImageAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum = new Intent(Pop_Album.this, Pop_Activity.class);
                startActivity(ImageAlbum);
            }
        });
        ImageView ImageAlbum2 = findViewById(R.id.pop_image_9);
        ImageAlbum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum2 = new Intent(Pop_Album.this, Pop_Activity_2.class);
                startActivity(ImageAlbum2);
            }
        });
        ImageView ImageAlbum3 = findViewById(R.id.pop_image_2);
        ImageAlbum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum3 = new Intent(Pop_Album.this, Pop_Activity_3.class);
                startActivity(ImageAlbum3);
            }
        });
        ImageView ImageAlbum4 = findViewById(R.id.pop_image_3);
        ImageAlbum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum4 = new Intent(Pop_Album.this, Pop_Activity_4.class);
                startActivity(ImageAlbum4);
            }
        });
        ImageView ImageAlbum5 = findViewById(R.id.pop_image_10);
        ImageAlbum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum5 = new Intent(Pop_Album.this, Pop_Activity_5.class);
                startActivity(ImageAlbum5);
            }
        });
        ImageView ImageAlbum6 = findViewById(R.id.pop_image_7);
        ImageAlbum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum6 = new Intent(Pop_Album.this, Pop_Activity_6.class);
                startActivity(ImageAlbum6);
            }
        });
        ImageView ImageAlbum7 = findViewById(R.id.pop_image_8);
        ImageAlbum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum7 = new Intent(Pop_Album.this, Pop_Activity_7.class);
                startActivity(ImageAlbum7);
            }
        });
        ImageView ImageAlbum8 = findViewById(R.id.pop_image_11);
        ImageAlbum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum8 = new Intent(Pop_Album.this, Pop_Activity_8.class);
                startActivity(ImageAlbum8);
            }
        });
        ImageView ImageAlbum9 = findViewById(R.id.pop_image_4);
        ImageAlbum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum9 = new Intent(Pop_Album.this, Pop_Activity_9.class);
                startActivity(ImageAlbum9);
            }
        });
        ImageView ImageAlbum10 = findViewById(R.id.pop_image_5);
        ImageAlbum10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum10 = new Intent(Pop_Album.this, Pop_Activity_10.class);
                startActivity(ImageAlbum10);
            }
        });
        ImageView ImageAlbum11 = findViewById(R.id.pop_image_12);
        ImageAlbum11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum11 = new Intent(Pop_Album.this, Pop_Activity_11.class);
                startActivity(ImageAlbum11);
            }
        });
        ImageView ImageAlbum12 = findViewById(R.id.pop_image_6);
        ImageAlbum12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ImageAlbum12 = new Intent(Pop_Album.this, Pop_Activity_12.class);
                startActivity(ImageAlbum12);
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