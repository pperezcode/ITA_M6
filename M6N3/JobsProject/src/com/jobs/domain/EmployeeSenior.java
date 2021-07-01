package com.jobs.domain;

public class EmployeeSenior extends Employee {

	public EmployeeSenior(String name, String address, String phone, String jobCategory, double grossSalaryPerMonth, IPaymentRate paymentRate) throws Exception {
		
		super(name, address, phone, jobCategory, grossSalaryPerMonth, paymentRate);
		
	}
	
}
