package com.examplepackage.LearnSpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examplePackege.gamePackege.GameRunner;
import com.examplePackege.gamePackege.GamingConsole;

public class App03GamingSpring {

	public static void main(String[] args) {
		try (
				var context=new AnnotationConfigApplicationContext(GamingConfiguration.class);

		)
		{
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
	}

}
