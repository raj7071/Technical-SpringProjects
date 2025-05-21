package com.infosys.javase8.repeatinganotations;

public interface Remunerator {
	public abstract double deductFoodFee();

	public final double HEALTH_INSURANCE_PERCENTAGE = 5.0;

	public abstract double deductHealthInsurancePremium();
}
