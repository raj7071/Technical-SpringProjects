package com.infosys.javase8.defaultmethod;

interface Greeting {
	default void hello() {
		System.out.println(" hello from A");
	}
}
