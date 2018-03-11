package com.thanglequoc.comparator;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import com.thanglequoc.song.comparator.Jukebox;

public class JukeboxTest {
    
    private Jukebox jukebox;
    
    @Before
    public void setUp() {
	jukebox = new Jukebox();
    }
    
    @Test
    public void should_PrintListOfSong() {
	jukebox.showPlaylist();
    }
    
    @Test
    public void should_SortPlaylistByTitleAscending_When_RunSortByTitleAscending () {
	String[] expectedSongOrder = {"Get Lucky", "In The End", "Keep On Walking", "Mercy", "Running Away"};
	
	jukebox.sortSongByTitleAscending();
	String[] actualSongOrder =  jukebox.getPlaylists().stream()
		.map(song -> song.getTitle())
		.collect(Collectors.toList()).toArray(new String[0]);
	
	assertArrayEquals(expectedSongOrder, actualSongOrder);
    }
    
    @Test
    public void should_SortPlaylistByTitleDescending_When_RunSortByTitleDescending() {
	String[] expectedSongOrder = {"Running Away", "Mercy", "Keep On Walking", "In The End", "Get Lucky"};
	
	jukebox.sortSongByTitleDescending();
	String[] actualSongOrder = jukebox.getPlaylists().stream()
		.map(song -> song.getTitle())
		.collect(Collectors.toList()).toArray(new String[0]);
	
	assertArrayEquals(expectedSongOrder, actualSongOrder);
    }
}
