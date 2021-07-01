package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {
	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	
	
	public static IPaymentRate createPaymentRateEmployeeJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth - salaryPerMonth*0.15; 
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployeeMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth - salaryPerMonth*0.10; 
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployeeSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth - salaryPerMonth*0.05; 
			}
		};
	}
	
}
