package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MusicCollection> categories = new ArrayList<MusicCollection>();
	    MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        categories.add(pop);
        categories.add(jazz);
        categories.add(rock);
        categories.add(country);
    }
}
