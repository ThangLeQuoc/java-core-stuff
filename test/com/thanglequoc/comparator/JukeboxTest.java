package com.thanglequoc.comparator;

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
}
