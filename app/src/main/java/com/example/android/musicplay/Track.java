package com.example.android.musicplay;


public class Track {

    private String mArtistName;
    private String mTrackName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Track(String artistName, String trackName) {
        mArtistName = artistName;
        mTrackName = trackName;
    }

    public Track(String artistName, String trackName, int imageResourceId) {
        mArtistName = artistName;
        mTrackName = trackName;
        mImageResourceId = imageResourceId;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getTrackName() {
        return mTrackName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}



