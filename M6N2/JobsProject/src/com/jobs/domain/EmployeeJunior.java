package com.jobs.domain;

public class EmployeeJunior extends Employee {

	public EmployeeJunior(String name, String address, String phone, String jobCategory, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		
		super(name, address, phone, jobCategory, salaryPerMonth, paymentRate);

	}

}
