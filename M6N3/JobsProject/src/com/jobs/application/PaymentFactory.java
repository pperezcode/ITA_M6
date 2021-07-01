package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {
	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double grossSalaryPerMonth) {
				double netSalaryPerMonth = calculateNetSalary(grossSalaryPerMonth, 32);			// Salario bruto e IRPF
				return netSalaryPerMonth*1.5;			// Aumento por categoría de empleado
			}
		};
	}
	
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {	
			@Override
			public double pay(double grossSalaryPerMonth) {
				double netSalaryPerMonth = calculateNetSalary(grossSalaryPerMonth, 26);			
				return netSalaryPerMonth*1.1;
			}
		};
	}
	
	
	public static IPaymentRate createPaymentRateEmployeeSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double grossSalaryPerMonth) {
				double netSalaryPerMonth = calculateNetSalary(grossSalaryPerMonth, 24);			
				return netSalaryPerMonth - netSalaryPerMonth*0.05; 
			}
		};
	}
	
	
	public static IPaymentRate createPaymentRateEmployeeMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double grossSalaryPerMonth) {
				double netSalaryPerMonth = calculateNetSalary(grossSalaryPerMonth, 15);			
				return netSalaryPerMonth - netSalaryPerMonth*0.10; 
			}
		};
	}
	
	
	public static IPaymentRate createPaymentRateEmployeeJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double grossSalaryPerMonth) {
				double netSalaryPerMonth = calculateNetSalary(grossSalaryPerMonth, 2);			
				return netSalaryPerMonth - netSalaryPerMonth*0.15; 
			}
		};
	}
	
		
	// MÉTODOS PROPIOS DE LA CLASE
	
	public static double calculateNetSalary(double grossSalary, int irpfPercentage) {
		double netSalary = grossSalary - ((grossSalary * irpfPercentage) / 100);
		return netSalary;	
	}
		
}
