package com.learn.designPatterns.adaptor;

public class AdaptorMain {

	public static void main(String[] args) {
		OldHelloWorld oldHelloWorld = new OldHelloWorldImpl();
		System.out.println(oldHelloWorld.sayHelloWorld());
		NewHelloWorld newHelloWorld = new NewHelloWorldImpl();
		oldHelloWorld = new NewToOldHelloWorldAdaptor(newHelloWorld); 
		System.out.println(oldHelloWorld.sayHelloWorld());
	}

}


interface OldHelloWorld {
	
	public String sayHelloWorld();
}

class OldHelloWorldImpl implements OldHelloWorld {
	@Override
	public String sayHelloWorld() {
		return "Hello World";
	}
}


interface NewHelloWorld {
	
	public String sayHello();
	
	public String sayWorld();
	
}

class NewHelloWorldImpl implements NewHelloWorld{
	@Override
	public String sayHello() {
		return "Hello";
		
	}
	
	@Override
	public String sayWorld() {
		return "World";
		
	}
}

class NewToOldHelloWorldAdaptor implements OldHelloWorld {
	
	private NewHelloWorld newHelloWorld;
	
	public NewToOldHelloWorldAdaptor(NewHelloWorld newHelloWorld) {
		this.newHelloWorld = newHelloWorld;
	}

	@Override
	public String sayHelloWorld() {
		return newHelloWorld.sayHello() +" "+ newHelloWorld.sayWorld() ;
	}
	
}
