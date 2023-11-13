package com.examplePackege.gamePackege;

public class GameRunner  {
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game=game;
	}
	public void run() {
		System.out.println("this is first gamming app");
		System.out.println(" ---------");
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
