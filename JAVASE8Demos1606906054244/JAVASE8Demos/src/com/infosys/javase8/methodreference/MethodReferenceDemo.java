package com.infosys.javase8.methodreference;

public class MethodReferenceDemo {
	public static void methodDisplay() {
		System.out.println("Squircle");
	}

	public static void main(String[] args) {
		Shape s = MethodReferenceDemo::methodDisplay;
		s.display();
	}
}
