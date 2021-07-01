package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, String jobCategory, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		
		switch (jobCategory) {		// Validación de sueldo
			case "Boss":
				if(salaryPerMonth < 8000) 
					throw new Exception("El salario mínimo para un Boss es 8000€");
				break;
			case "Manager":
				if(salaryPerMonth < 3000 || salaryPerMonth > 5000) 
					throw new Exception("El salario de un Manager tiene que estar entre 3000€ y 5000€");
				break;	
			case "Senior":
				if(salaryPerMonth < 2700 || salaryPerMonth > 4000) 
					throw new Exception("El salario de un Senior tiene que estar entre 2700€ y 4000€");
				break;
			case "Mid":
				if(salaryPerMonth < 1800 || salaryPerMonth > 2500) 
					throw new Exception("El salario de un Mid tiene que estar entre 1800€ y 2500€");
				break;
			case "Junior":
				if(salaryPerMonth < 900 || salaryPerMonth > 1600) 
					throw new Exception("El salario de un Junior tiene que estar entre 900€ y 1600€");
				break;
			default:
				throw new Exception("Revisa los valores introducidos");
		}

		if(paymentRate==null) throw new Exception();
				
		this.jobCategory = jobCategory;
		this.salaryPerMonth = salaryPerMonth;
		this.paymentRate = paymentRate;
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
	public String getDescription() {
		return null;
	}


	@Override
	public String toString() {
		String text = "\n\n**** Id: " + super.getId() + " ****\nNombre: " + super.getName() + "\nDirección: " + super.getAddress() + 
				"\nTeléfono: " + super.getPhone() + "\nCategoría: " + super.getJobCategory() +
				"\nSueldo mensual: " + salaryPerMonth + "\nSueldo total: " + super.getTotalPaid();
		return text;
	}

}
