package com.infosys.javase8.staticmethod;

public class RemuneratorTest {
	public static void main(String[] args) {
		Double pension = Remunerator.deductForPension(20000);
		System.out.println(pension);
	}
}
