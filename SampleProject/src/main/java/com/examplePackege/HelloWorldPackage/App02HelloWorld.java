package com.examplePackege.HelloWorldPackage;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

	public static void main(String[] args) {
		// 1: launch a spring context
		
		// 2: configure the things that we want spring to manage
		
		
		try (var context = new AnnotationConfigApplicationContext(HelloworldConfiguration.class);) {
			System.out.println("your name : " + context.getBean("name"));
			System.out.println("your age is : " + context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
			System.out.println(context.getBean("person4"));
			System.out.println(context.getBean("address2"));
			// System.out.println( context.getBean(Address.class));
			// to list all beans in spring beans

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::print);

		}
	  
	  
		
	}
}
