package com.example.android.musicplay.Chill_Album;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.android.musicplay.Chill_Activity.ChillActivity;
import com.example.android.musicplay.Chill_Activity.ChillActivity10;
import com.example.android.musicplay.Chill_Activity.ChillActivity11;
import com.example.android.musicplay.Chill_Activity.ChillActivity12;
import com.example.android.musicplay.Chill_Activity.ChillActivity2;
import com.example.android.musicplay.Chill_Activity.ChillActivity3;
import com.example.android.musicplay.Chill_Activity.ChillActivity4;
import com.example.android.musicplay.Chill_Activity.ChillActivity5;
import com.example.android.musicplay.Chill_Activity.ChillActivity6;
import com.example.android.musicplay.Chill_Activity.ChillActivity7;
import com.example.android.musicplay.Chill_Activity.ChillActivity8;
import com.example.android.musicplay.Chill_Activity.ChillActivity9;
import com.example.android.musicplay.R;

public class ChillAlbum extends AppCompatActivity {

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
                Intent chillImageAlbum = new Intent(ChillAlbum.this, ChillActivity.class);
                startActivity(chillImageAlbum);
            }
        });

        ImageView chillImageAlbum2 = findViewById(R.id.chill_image_9);
        chillImageAlbum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum2 = new Intent(ChillAlbum.this, ChillActivity2.class);
                startActivity(chillImageAlbum2);
            }
        });

        ImageView chillImageAlbum3 = findViewById(R.id.chill_image_2);
        chillImageAlbum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum3 = new Intent(ChillAlbum.this, ChillActivity3.class);
                startActivity(chillImageAlbum3);
            }
        });
        ImageView chillImageAlbum4 = findViewById(R.id.chill_image_3);
        chillImageAlbum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum4 = new Intent(ChillAlbum.this, ChillActivity4.class);
                startActivity(chillImageAlbum4);
            }
        });
        ImageView chillImageAlbum5 = findViewById(R.id.chill_image_4);
        chillImageAlbum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum5 = new Intent(ChillAlbum.this, ChillActivity5.class);
                startActivity(chillImageAlbum5);
            }
        });
        ImageView chillImageAlbum6 = findViewById(R.id.chill_image_5);
        chillImageAlbum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum6 = new Intent(ChillAlbum.this, ChillActivity6.class);
                startActivity(chillImageAlbum6);
            }
        });
        ImageView chillImageAlbum7 = findViewById(R.id.chill_image_7);
        chillImageAlbum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum7 = new Intent(ChillAlbum.this, ChillActivity7.class);
                startActivity(chillImageAlbum7);
            }
        });
        ImageView chillImageAlbum8 = findViewById(R.id.chill_image_8);
        chillImageAlbum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum8 = new Intent(ChillAlbum.this, ChillActivity8.class);
                startActivity(chillImageAlbum8);
            }
        });
        ImageView chillImageAlbum9 = findViewById(R.id.chill_image_10);
        chillImageAlbum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum9 = new Intent(ChillAlbum.this, ChillActivity9.class);
                startActivity(chillImageAlbum9);
            }
        });
        ImageView chillImageAlbum10 = findViewById(R.id.chill_image_11);
        chillImageAlbum10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum10 = new Intent(ChillAlbum.this, ChillActivity10.class);
                startActivity(chillImageAlbum10);
            }
        });
        ImageView chillImageAlbum11 = findViewById(R.id.chill_image_12);
        chillImageAlbum11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum11 = new Intent(ChillAlbum.this, ChillActivity11.class);
                startActivity(chillImageAlbum11);
            }
        });
        ImageView chillImageAlbum12 = findViewById(R.id.chill_image_6);
        chillImageAlbum12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillImageAlbum12 = new Intent(ChillAlbum.this, ChillActivity12.class);
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