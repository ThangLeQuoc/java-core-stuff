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
	String[] actualSongOrder =  getSongTitleInPlaylist();
	
	assertArrayEquals(expectedSongOrder, actualSongOrder);
    }
    
    @Test
    public void should_SortPlaylistByTitleDescending_When_RunSortByTitleDescending() {
	String[] expectedSongOrder = {"Running Away", "Mercy", "Keep On Walking", "In The End", "Get Lucky"};
	
	jukebox.sortSongByTitleDescending();
	String[] actualSongOrder = getSongTitleInPlaylist();
	
	assertArrayEquals(expectedSongOrder, actualSongOrder);
    }
    
    @Test
    public void should_SortPlaylistByArtistAscending_When_RunSortByArtistAscending() {
	String[] expectedSongOrder = {"Get Lucky", "Keep On Walking", "Running Away", "In The End", "Mercy"};
	
	jukebox.sortSongByArtistAscending();
	String [] actualSongOrder = getSongTitleInPlaylist();
	
	assertArrayEquals(expectedSongOrder, actualSongOrder);
    }
    
    @Test
    public void should_SortPlaylistByArtistDescending_When_RunSortByArtistDescending() {
	String[] expectedSongOrder = {"Mercy", "In The End", "Running Away", "Keep On Walking", "Get Lucky"};
	
	jukebox.sortSongByArtistDescending();
	String[] actualSongOrder = getSongTitleInPlaylist();
	
	assertArrayEquals(expectedSongOrder, actualSongOrder);
    }
    
    @Test
    public void should_SortPlaylistByPriceAscending_When_RunSortByPriceAscending() {
	String[] expectedSongOrder = {"Mercy", "Keep On Walking", "In The End", "Running Away", "Get Lucky"};
	
	jukebox.sortSongByPriceAscending();
	String[] actualSongOrder = getSongTitleInPlaylist();
	
	assertArrayEquals(expectedSongOrder, actualSongOrder);
    }
    
    @Test
    public void should_SortPlaylistByPriceDescending_When_RunSortByPriceDescending() {
	String [] expectedSongOrder = {"Get Lucky", "Running Away", "In The End", "Keep On Walking", "Mercy"};
	
	jukebox.sortSongByPriceDescending();
	String[] actualSongOrder = getSongTitleInPlaylist();
	
	assertArrayEquals(expectedSongOrder, actualSongOrder);
    }

    private String[] getSongTitleInPlaylist() {
	return jukebox.getPlaylists().stream()
		.map(song -> song.getTitle()).collect(Collectors.toList()).toArray(new String[0]);
    }
}
