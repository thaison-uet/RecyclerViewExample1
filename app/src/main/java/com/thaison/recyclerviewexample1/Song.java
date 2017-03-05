package com.thaison.recyclerviewexample1;

/**
 * Created by Shin on 11/18/2016.
 */

public class Song {
    private String code;
    private String title;
    private String lyric;
    private String artist;

    public Song(String mCode, String mTitle, String mLyric, String mArtist) {
        this.code = mCode;
        this.title = mTitle;
        this.lyric = mLyric;
        this.artist = mArtist;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getLyric() {
        return lyric;
    }

    public String getArtist() {
        return artist;
    }
}
