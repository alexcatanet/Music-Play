package com.example.android.musicplay;

/**
 * {@link Track} represents a song item that the user wants to play (listen).
 * It contains a artist name, a track name, and an image for that song.
 */
public class Track {

    /**
     * Artist name for the track
     */
    private String mArtistName;

    /**
     * Track name for the track
     */
    private String mTrackName;

    /**
     * Image resource ID for the track
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Constant value that represents no image was provided for this track
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Track object.
     *
     * @param artistName is the name of the artist which stands for each album
     * @param trackName  name of the each individual song
     */
    public Track(String artistName, String trackName) {
        mArtistName = artistName;
        mTrackName = trackName;
    }

    /**
     * Create a new Track object.
     *
     * @param artistName      is the name of the artist which stands for each album
     * @param trackName       name of the each individual song
     * @param imageResourceId is the drawable resource ID for the image associated with the track
     */
    public Track(String artistName, String trackName, int imageResourceId) {
        mArtistName = artistName;
        mTrackName = trackName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the artist name of this track.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the current track name of the word.
     */
    public String getTrackName() {
        return mTrackName;
    }

    /**
     * Return the image resource ID of the track.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for this track.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}



