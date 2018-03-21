package com.linkedList.challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static PlayList playlist = new PlayList("playlist");
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;

		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				createNewAlbum();
				break;
			case 2:
				addNewSongToAlbum();
				break;
			case 3:
				addSongToPlayList();
				break;
			case 4:
				showAllSongsInPlayList();
				break;
			case 5:
				printAlbums();
				break;
			case 6:
				LinkedList<Song> songList = playlist.getPlaylist();
				play(songList);
				break;
			case 7:
				quit = true;
				break;
			}
		}

	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To create a new album");
		System.out.println("\t 2 - To add a new song to the album");
		System.out.println("\t 3 - To add songs to the playlist");
		System.out.println("\t 4 - To print all the songs in the playlist");
		System.out.println("\t 5 - To print albums purchased");
		System.out.println("\t 6 - To play music in the playlist");
		System.out.println("\t 7 - To quit the application.");
	}

	public static void createNewAlbum() {

		System.out.println("Enter the album name");
		String albumName = scanner.nextLine();
		if (playlist.addAlbum(albumName)) {
			System.out.println("the album " + albumName + " added to the list");
		} else {
			System.out.println("the album could not be added");
		}

	}

	// public static void playSongs() {
	// LinkedList<Song> songList = playlist.getPlaylist();
	// playlist.play(songList);
	// }

	public static void play(LinkedList<Song> song) {
		boolean flag = false;
		ListIterator<Song> listIterator = song.listIterator();

		if (song.isEmpty()) {
			System.out.println("No songs in the list");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next());
			playlist.printMenu();
		}

		while (!flag) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Stopping the music");
				flag = true;
				break;

			case 1:

				if (listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("Reached the end of the list");
				}
				break;

			case 2:

				if (listIterator.hasPrevious()) {
					System.out.println("Replaying " + listIterator.previous().toString());
				} else {
					System.out.println("We are at the start of the list");
				}
				break;

			}

		}
	}

	public static void addNewSongToAlbum() {
		System.out.println("Enter the album name");
		String albumName = scanner.nextLine();
		System.out.println("Enter the song name");
		String songName = scanner.nextLine();
		System.out.println("Enter the duration");
		double duration = scanner.nextDouble();
		if (playlist.addSongsToAlbum(albumName, songName, duration)) {
			System.out.println("song : " + songName + " added to the album : " + albumName);
		} else {
			System.out.println("song could not be added to the album");
		}

	}

	public static void addSongToPlayList() {
		System.out.println("Enter the album name");
		String albumName = scanner.nextLine();
		System.out.println("Enter the song name");
		String songName = scanner.nextLine();
		if (playlist.addSongsToPlayList(songName, albumName)) {
			System.out
					.println("the song : " + songName + " from the album " + albumName + " was added to the playlist");
		} else {
			System.out.println("the song could not be added to the playlist");
		}

	}

	public static void showAllSongsInPlayList() {
		playlist.printSongs();
	}

	public static void printAlbums() {
		playlist.printAlbums();
	}

}
