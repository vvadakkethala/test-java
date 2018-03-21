package com.linkedList.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayList {

	private String name;
	private ArrayList<Album> albums = new ArrayList<Album>();
	private LinkedList<Song> playlist;

	public LinkedList<Song> getPlaylist() {
		return playlist;
	}

	public PlayList(String name) {
		this.name = name;
		this.playlist = new LinkedList<Song>();
	}

	public boolean addSongsToPlayList(String songName, String AlbumName) {
		Song song = findSonginAlbum(songName, AlbumName);
		if (song == null) {
			return false;
		} else {
			this.playlist.add(song);
			return true;
		}
	}

	public void printSongs() {
		for (int i = 0; i < this.playlist.size(); i++) {
			System.out.println("songs : " + (i + 1) + " : " + this.playlist.get(i).getTitle());
		}
	}

	public Song findSonginAlbum(String songname, String AlbumName) {
		int position = findAlbum(AlbumName);
		if (position >= 0) {
			for (int i = 0; i < albums.get(position).getSongs().size(); i++) {
				if (albums.get(position).getSongs().get(i).getTitle().equals(songname)) {
					return albums.get(position).getSongs().get(i);
				}
			}
		}
		return null;
	}

	public void printAlbums() {
		for (int i = 0; i < albums.size(); i++) {
			System.out.println("albums : " + (i + 1) + " - " + albums.get(i).getName());
		}
	}

	public boolean addSongsToAlbum(String AlbumName, String songName, double duration) {
		int position = findAlbum(AlbumName);
		if (position >= 0) {
			albums.get(position).addSong(songName, duration);
			return true;
		}
		return false;
	}

	public boolean addAlbum(String albumName) {
		int position = findAlbum(albumName);
		if (position >= 0) {
			return false;
		} else {
			albums.add(Album.createAlbum(albumName));
			return true;
		}
	}

	public int findAlbum(String albumName) {
		for (int i = 0; i < albums.size(); i++) {
			if (albums.get(i).getName().equals(albumName)) {
				return i;
			}
		}
		return -1;
	}

//	public void play(LinkedList<Song> song) {
//		Scanner scanner = new Scanner(System.in);
//		boolean flag = false;
//		ListIterator<Song> listIterator = song.listIterator();
//
//		if (song.isEmpty()) {
//			System.out.println("No songs in the list");
//			return;
//		} else {
//			System.out.println("Now playing " + listIterator.next());
//			printMenu();
//		}
//
//		while (!flag) {
//			int action = scanner.nextInt();
//			scanner.nextLine();
//			switch (action) {
//			case 0:
//				System.out.println("Stopping the music");
//				flag = true;
//				break;
//
//			case 1:
//
//				if (listIterator.hasNext()) {
//					System.out.println("Now playing " + listIterator.next());
//				} else {
//					System.out.println("Reached the end of the list");
//				}
//				break;
//
//			case 2:
//
//				if (listIterator.hasPrevious()) {
//					System.out.println("Replaying " + listIterator.previous());
//				} else {
//					System.out.println("We are at the start of the list");
//				}
//				break;
//
//			}
//
//		}
//	}

	public static void printMenu() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To stop music");
		System.out.println("\t 1 - To play next");
		System.out.println("\t 2 - To replay");
	}

}
