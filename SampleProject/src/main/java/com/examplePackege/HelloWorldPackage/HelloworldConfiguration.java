package com.examplePackege.HelloWorldPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name,int age,Address address) {};
record Address(String firstline,String city) {};
@Configuration
public class HelloworldConfiguration {
	@Bean
	public String name() {
		return "Mengistu araya";
	}
	@Bean
	public int age() {
		return 27;
	}
	@Bean
	public Person person() {
		return new Person("efrem ",22,new Address("Tigray","Mekele"));
	}
	@Bean(name="person2")
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	@Bean(name="person3")
	public Person person3Parameter(String name,int age,Address address3) {
		return new Person(name,age,address3);
	}
	@Bean(name="person4")
	public Person person4Parameter(String name,int age,Address address) {
		return new Person(name,age,address);
	}
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("Baker street","London");
	}
	@Bean(name="address3")
	public Address address3() {
		return new Address("axum street","axum");
	}

}
