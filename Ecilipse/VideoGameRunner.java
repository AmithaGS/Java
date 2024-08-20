package com.xworkz.engineering;
import com.xworkz.engineering.VideoGame;

public class VideoGameRunner {

	public static void main(String[] args) {
		VideoGame videoGame1= new VideoGame("car race", 2, true);
        VideoGame videoGame2= new VideoGame("chess", 2, false);
        VideoGame videoGame3= new VideoGame("ludo", 4, true);

        VideoGame[] videoGames = {videoGame1, videoGame2, videoGame3};

        System.out.println("Number of video games: " + videoGames.length);

        for (int start = 0;start<videoGames.length;start++) {
            System.out.println("Reading video game from index: " +start);
            VideoGame ref = videoGames[start];
            ref.display();
        }
	}
}
