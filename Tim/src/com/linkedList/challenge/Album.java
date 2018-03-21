package com.linkedList.challenge;

import java.util.ArrayList;

public class Album {

	private String name;
	ArrayList<Song> songs;

	public Album(String name) {
		this.name = name;
		this.songs = new ArrayList<Song>();
	}

	public boolean addSong(String songTitle, double duration) {
		if (findSong(songTitle) >= 0) {
			return false;
		} else {
			this.songs.add(new Song(songTitle, duration));
			return true;
		}
	}

	public int findSong(String songTitle) {
		for (int i = 0; i < this.songs.size(); i++) {
			if (this.songs.get(i).getTitle().equals(songTitle)) {
				return i;
			}
		}
		return -1;
	}

	public static Album createAlbum(String Albumname) {
		return new Album(Albumname);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

}
