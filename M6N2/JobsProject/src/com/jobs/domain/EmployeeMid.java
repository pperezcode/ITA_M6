package com.jobs.domain;

public class EmployeeMid extends Employee {

	public EmployeeMid(String name, String address, String phone, String jobCategory, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		
		super(name, address, phone, jobCategory, salaryPerMonth, paymentRate);
		
	}	

}
