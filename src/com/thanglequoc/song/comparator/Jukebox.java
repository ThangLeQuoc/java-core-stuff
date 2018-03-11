package com.thanglequoc.song.comparator;

import java.util.ArrayList;
import java.util.List;

public class Jukebox {
    
    private List<Song> playlists;
    
    public Jukebox() {
	fetchSong();
    }
    
    
    private void fetchSong() {
	playlists = new ArrayList<>();
	
	Song song1 = new Song("Mercy", "Drone", "Muse", 12);
	playlists.add(song1);
	Song song2 = new Song("Get Lucky", "Random Access Memories", "Daft Punk", 40);
	playlists.add(song2);
	Song song3 = new Song("Running Away", "Right Where You Want Me", "Jesse McCartney", 37);
	playlists.add(song3);
	Song song4 = new Song("In The End", "Hybrid Theory", "Linkin Park", 31);
	playlists.add(song4);
	Song song5 = new Song("Keep On Walking", "English Rain", "Gabrielle Aplin", 21);
	playlists.add(song5);
    }
    
    public void sortSongByTitleAscending() {
	TitleComparator titleComparator = new TitleComparator();
	playlists.sort(titleComparator);
    }
    
    public void showPlaylist() {
	for(Song song: playlists) {
	    System.out.println("--------------------------");
	    System.out.println(song.getTitle() + " -- " + song.getArtist());	    
	}
    }

    public List<Song> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Song> playlists) {
        this.playlists = playlists;
    }
    
}
