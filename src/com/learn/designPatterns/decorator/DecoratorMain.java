package com.learn.designPatterns.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		HelloWorld helloWorld = new NormalHelloWorld();
		System.out.println(helloWorld.sayHelloWorld());
		helloWorld = new DecorateHelloWorldWithMe(new NormalHelloWorld(), "Me");
		System.out.println(helloWorld.sayHelloWorld());
	}

}

interface HelloWorld {
	
	public String sayHelloWorld();
	
}

class NormalHelloWorld implements HelloWorld{
	@Override
	public String sayHelloWorld() {
		return "hello world";
	}
}

class DecorateHelloWorldWithMe implements HelloWorld {
	
	private HelloWorld helloWorld;
	
	private String name;
	
	public DecorateHelloWorldWithMe(HelloWorld helloWorld, String name) {
		this.helloWorld = helloWorld;
		this.name = name;
	}

	@Override
	public String sayHelloWorld() {
		return this.helloWorld.sayHelloWorld() +" "+ this.name;
	}
	
}
