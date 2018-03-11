package com.thanglequoc.song.comparator;

import java.util.Comparator;

public class TitleComparator implements Comparator<Song> {

    @Override
    public int compare(Song song1, Song song2) {
	return song1.getTitle().compareToIgnoreCase(song2.getTitle());
    }

}
