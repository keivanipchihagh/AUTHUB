package com.company;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // AN ArrayList for storing favorite musics
    private ArrayList<Music> fav;
    // An ArrayList for storing the musics.
    private ArrayList<Music> music;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        fav = new ArrayList<Music>();
        music = new ArrayList<Music>();
    }
    
    /**
     * Add a file to the collection.
     * @param music The music to be added.
     */
    public void addMusic(Music music)
    {
        this.music.add(music);
    }

    /**
     * Add a music to the favorite collection.
     * @param music The music to be added.
     */
    public void addfav(Music music)
    {
        this.fav.add(music);
    }
    
    /**
     * Return the number of files in the collection.
     * @return size
     */
    public int getNumberOfMusics()
    {
        return music.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listMusic(int index)
    {
        print(music.get(index));
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllMusics()
    {
        for (Music i : music)
        {
            print(i);
        }
    }

    public void listAllfav()
    {
        for (Music i : fav)
        {
            print(i);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeMusic(int index)
    {
        music.remove(index);
    }

    public void removefav(int index)
    {
        fav.remove(index);
    }

    public void print(Music i)
    {
        System.out.println("music address : " + i.fileAddress);
        System.out.println("music singer : " + i.singer);
        System.out.println("music release Date : " + i.releaseDate);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        print(music.get(index));
        System.out.println("is playing rn!");
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        System.out.println("Music has stopped playing!");
    }

    public void search(String something)
    {
        for( Music i : music )
        {
            if( i.singer.equals(something) || i.fileAddress.equals(something) )
            {
                System.out.println("Music found!");
                print(i);
                return;
            }
        }

        System.out.println("Music not found!");
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     */
    private void validIndex(int index)
    {
        if( index > music.size() )
        {
            System.out.println("given index is invalid!");
            return;
        }

        System.out.println("given index is valid");
    }
}