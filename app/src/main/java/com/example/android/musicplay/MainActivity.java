package com.example.android.musicplay;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import com.example.android.musicplay.Chill_Album.ChillAlbum;
import com.example.android.musicplay.Focus_Album.FocusAlbum;
import com.example.android.musicplay.Game_Album.GameAlbum;
import com.example.android.musicplay.Indie_Album.IndieAlbum;
import com.example.android.musicplay.Mood_Album.MoodAlbum;
import com.example.android.musicplay.Party_Album.PartyAlbum;
import com.example.android.musicplay.Pop_Album.PopAlbum;
import com.example.android.musicplay.Rap_Album.RapAlbum;
import com.example.android.musicplay.Rock_Album.RockAlbum;
import com.example.android.musicplay.Romance_Album.RomanceAlbum;
import com.example.android.musicplay.Sleep_Album.SleepAlbum;
import com.example.android.musicplay.Soul_Album.SoulAlbum;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView chillCategory = findViewById(R.id.chill_image);
        chillCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chillCategory = new Intent(view.getContext(), ChillAlbum.class);
                startActivityForResult(chillCategory, 0);
            }
        });

        ImageView popCategory = findViewById(R.id.pop);
        popCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popCategory = new Intent(view.getContext(), PopAlbum.class);
                startActivityForResult(popCategory, 0);
            }
        });

        ImageView focusCategory = findViewById(R.id.focus_image);
        focusCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent focusCategory = new Intent(view.getContext(), FocusAlbum.class);
                startActivityForResult(focusCategory, 0);
            }
        });

        ImageView indieCategory = findViewById(R.id.indie_image);
        indieCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indieCategory = new Intent(view.getContext(), IndieAlbum.class);
                startActivityForResult(indieCategory, 0);
            }
        });

        ImageView rapCategory = findViewById(R.id.rap);
        rapCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rapCategory = new Intent(view.getContext(), RapAlbum.class);
                startActivityForResult(rapCategory, 0);
            }
        });

        ImageView partyCategory = findViewById(R.id.party_image_genre);
        partyCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent partyCategory = new Intent(view.getContext(), PartyAlbum.class);
                startActivityForResult(partyCategory, 0);
            }
        });

        ImageView romanceCategory = findViewById(R.id.romance_image_genre);
        romanceCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent romanceCategory = new Intent(view.getContext(), RomanceAlbum.class);
                startActivityForResult(romanceCategory, 0);
            }
        });

        ImageView rockCategory = findViewById(R.id.rock);
        rockCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockCategory = new Intent(view.getContext(), RockAlbum.class);
                startActivityForResult(rockCategory, 0);
            }
        });

        ImageView gamekCategory = findViewById(R.id.gaming_image_genre);
        gamekCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gamekCategory = new Intent(view.getContext(), GameAlbum.class);
                startActivityForResult(gamekCategory, 0);
            }
        });

        ImageView moodkCategory = findViewById(R.id.mood_image_genre);
        moodkCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moodkCategory = new Intent(view.getContext(), MoodAlbum.class);
                startActivityForResult(moodkCategory, 0);
            }
        });

        ImageView soulCategory = findViewById(R.id.africa);
        soulCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent soulCategory = new Intent(view.getContext(), SoulAlbum.class);
                startActivityForResult(soulCategory, 0);
            }
        });

        ImageView sleepCategory = findViewById(R.id.sleep_image_genre);
        sleepCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sleepCategory = new Intent(view.getContext(), SleepAlbum.class);
                startActivityForResult(sleepCategory, 0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
