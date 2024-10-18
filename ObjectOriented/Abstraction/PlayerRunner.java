package Abstraction;

public class PlayerRunner {

	public static void main(String[] args) {
		Player p = new Spotify();
		p.play();
		p.stop();
		p.pause();
	}
}

interface Player {
	void play();
	void stop();
	default void pause() {
		System.out.println("Playback paused");
	}
	static void reset() {
		System.out.println("playback reset");
	}
}

class Spotify implements Player {
	public void play() {
		System.out.println("Play song");
	}
	public void stop() {
		System.out.println("Play stop");
	}
}