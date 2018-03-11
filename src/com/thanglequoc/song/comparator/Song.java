package com.thanglequoc.song.comparator;

public class Song implements Comparable<Song> {
    private String title;
    private String album;
    private String artist;
    private double price;
    
    public Song() {}

    public Song(String title, String album, String artist, double price) {
	this.title = title;
	this.album = album;
	this.artist = artist;
	this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Song o) {
	// TODO Auto-generated method stub
	return 0;
    }
}
