package com.xworkz.engineering;

public class VideoGame {
	private String name;
    private int noOfPlayers;
    private boolean isVideoGame;

    public VideoGame(String name, int noOfPlayers, boolean isVideoGame) {
        this.name = name;
        this.noOfPlayers = noOfPlayers;
        this.isVideoGame = isVideoGame;
        System.out.println("Parameters are created with String, int, and boolean");
    }

    public void display() {
        System.out.println("Video game name is: " + this.name);
        System.out.println("Number of video game players is: " + this.noOfPlayers);
        System.out.println("Video game is: " + this.isVideoGame);
    }
}
