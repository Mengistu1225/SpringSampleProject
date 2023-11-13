package com.examplePackege.gamePackege;

public class App01GamingBasic {

	public static void main(String[] args) {
		//var game=new MarioGame();
		//var game=new PacmanGame();
		var game =new SuperContraGame();  // 1: object creation  
		var gameRunner= new GameRunner(game); // 2: object creation + wiring dependences
		                                    // game is dependency of gameRunner
		gameRunner.run();
	}

}
