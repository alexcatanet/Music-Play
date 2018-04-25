package com.example.android.musicplay.Track_Chill_Adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicplay.R;
import com.example.android.musicplay.Track;

import java.util.ArrayList;

public class Track_Chill_Adapter extends ArrayAdapter<Track> {

    public Track_Chill_Adapter(Context context, ArrayList<Track> tracks) {
        super(context, 0, tracks);
    }

    // Check if the existing view is being reused, otherwise inflate the view
    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Get the object located at this position in the list
        Track currentTrack = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.chill_artist_1,
                    parent, false);
        }
        ImageView albumImage = convertView.findViewById(R.id.chill_album_image);
        assert currentTrack != null;

        if (currentTrack.hasImage()) {
            albumImage.setImageResource(currentTrack.getImageResourceId());
            albumImage.setVisibility(View.VISIBLE);
        }

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistName = convertView.findViewById(R.id.chill_artist_name);
        /*
        Get the version number from the current AndroidFlavor object and
        set this text on the number TextView
        */
        artistName.setText(currentTrack.getArtistName());

        TextView trackName = convertView.findViewById(R.id.chill_track_name);
        trackName.setText(currentTrack.getTrackName());
        /*
        Return the whole list item layout (containing 2 TextViews and an ImageView)
        so that it can be shown in the ListView
        */
        return convertView;
    }
}

