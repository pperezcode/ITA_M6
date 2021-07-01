package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	// MÉTODOS A SOBREESCRIBIR DE LA CLASE ABSTRACT PADRE

	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	
	@Override
	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}

	@Override
	public String getDescripcio() {
		return null;
	}

	@Override
	public String toString() {
		String text = "\n\n**** Id: " + super.getId() + " ****\nNombre: " + super.getName() +
				"\nDirección: " + super.getAddress() + "\nTeléfono: " + super.getPhone() +
				"\nSueldo mensual: " + salaryPerMonth + "\nSueldo total: " + super.getTotalPaid();
		return text;
	}

}
