package com.thanglequoc.song.comparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<Song> {

    @Override
    public int compare(Song song1, Song song2) {
	return (int) (song1.getPrice() - song2.getPrice());
    }

}
