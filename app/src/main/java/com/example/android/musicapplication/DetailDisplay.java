package com.example.android.musicapplication;

/**
 * *{@link DetailDisplay} is an item that we use to display on the main screen of the application
 * and the subscreen as well. For example, an album contains an album name, album image. An artist
 * has a name and his/her image. A playlist and podcast too has a name and an image associated with it.
 */

public class DetailDisplay  {

    /** Has the name of Album/Artist/Playlist/Podcast*/
    private String mName;

    /** Has the image of Album/Artist/Playlist/Podcast*/
    private int mImageResouceId;


    /**
     * Create a new DetailDisplay object.
     * @param name is the name of the album/artist/playlist/podcast.
     * @param imageResourceId is the image associated with the album/artist/playlist/podcast.
     */
    public DetailDisplay(String name, int imageResourceId){
        mName = name;
        mImageResouceId = imageResourceId;
    }

    /**
     * Get the name of album/artist/podcast/playlist.
     */
    public String getName() {
        return mName;
    }


    /**
     *Get the image of the album/artist/podcast/playlist.
     */
    public int getImageResouceId() {
        return mImageResouceId;
    }
}
