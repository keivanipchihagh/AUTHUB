package com.company;

import java.util.ArrayList;

public class Main {
    private ArrayList<String> tracks;

    public void removeTrack(String nameLike) {
        //contains Exception
        //NullPointerException − if the value of nameLike is null.
        if(nameLike == null)
            return;

        for(int i = 0 ; i < tracks.size() ; i++)
            if(tracks.get(i).contains(nameLike))
                tracks.remove(i);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
