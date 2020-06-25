package com.example.android.musicapplication;

public class Song {

    private String mSongName;

    private String mSongDuration;

    private int mImageResourceId;

    public Song(String songName, String songDuration, int imageResourceId){
        mSongName = songName;
        mSongDuration = songDuration;
        mImageResourceId = imageResourceId;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getSongDuration() {
        return mSongDuration;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
