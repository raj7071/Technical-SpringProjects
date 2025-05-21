package com.infosys.javase8.repeatinganotations;

public class Tester {
	public static void main(String[] args) {
		Author[] authArray = FullTimeEmployee.class.getAnnotationsByType(Author.class);
		for (Author author : authArray) {
			System.out.println(author.name() + "     " + author.method());
		}
	}
}
