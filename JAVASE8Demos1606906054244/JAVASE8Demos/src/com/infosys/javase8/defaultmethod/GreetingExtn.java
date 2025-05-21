package com.infosys.javase8.defaultmethod;

interface GreetingExtn extends Greeting{
	@Override
    default void hello() {
		System.out.println(" hello from B");
    }
}

