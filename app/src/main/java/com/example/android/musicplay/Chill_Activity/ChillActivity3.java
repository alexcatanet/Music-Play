package com.example.android.musicplay.Chill_Activity;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.android.musicplay.R;
import com.example.android.musicplay.Track;
import com.example.android.musicplay.Track_Chill_Adapter.TrackChillAdapter;

import java.util.ArrayList;


public class ChillActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceStace) {
        super.onCreate(savedInstanceStace);
        setContentView(R.layout.chill_artist_list);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));
        tracks.add(new Track("Above & Beyond", "Common Ground", R.drawable.chill_2));

        TrackChillAdapter adapter = new TrackChillAdapter(this, tracks);
          /*
        Displays a vertically-scrollable collection of views, where each view is positioned
         immediatelybelow the previous view in the list.
         */
        ListView listView = findViewById(R.id.chill_example);
        assert listView != null;
        listView.setAdapter(adapter);
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
