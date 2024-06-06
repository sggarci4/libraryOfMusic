package com.gustavogarcia.libraryofmusic.models;

public class Song extends Audio{
    private String artist;

    public Song(String title, String artist,double length, int totalPlays, int likes) {
        this.setTitle(title);
        this.artist = artist;
        this.setLength(length);
        this.setTotalPlays(totalPlays);
        this.setLikes(likes);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
