package com.learn.designPatterns.strategy;


public class StrategyMain {

	public static void main(String[] args) {
		HelloWorldStrategy strategy = new UseString();
		System.out.println(strategy.sayHelloWorld());
		strategy = new UseStringBuilder(); //LSP design principle
		System.out.println(strategy.sayHelloWorld());
	}
	
}


interface HelloWorldStrategy {
	
	public String sayHelloWorld();
	
}


/**
 * UseString - class is used to construct hello world using String 
 * Object
 *  
 * @author kbalaji
 *
 */
class UseString implements HelloWorldStrategy {

	@Override
	public String sayHelloWorld() {
		System.out.println("Strategy 1 - building hello world using String Object");
		return "Hello World";
	}
}

/**
 * UseStringBuilder - class is used to construct hello world using StringBuilder 
 * Object
 * @author kbalaji
 *
 */
class UseStringBuilder implements HelloWorldStrategy {
	
	@Override
	public String sayHelloWorld() {
		System.out.println("Strategy 2 - building hello world using StringBuilder Object");
		return new StringBuffer("Hello World").toString();
	}	
}

