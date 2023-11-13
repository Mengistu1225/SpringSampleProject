package com.examplepackage.LearnSpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.examplePackege.gamePackege.GameRunner;
import com.examplePackege.gamePackege.GamingConsole;
import com.examplePackege.gamePackege.PacmanGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}

}
