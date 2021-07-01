package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double grossSalaryPerMonth;
	protected double netSalaryPerMonth;
	protected double grossSalaryPerYear;
	protected double netSalaryPerYear;
	
	protected IPaymentRate paymentRate;	

	
	public Employee(String name, String address, String phone, String jobCategory, double grossSalaryPerMonth, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);	
		
		if(paymentRate==null) throw new Exception();

		
		switch (jobCategory) {		// Validación de sueldo
			case "Boss":
				if(grossSalaryPerMonth < 8000) 
					throw new Exception("El salario mínimo para un Boss es 8.000€ brutos mensuales.");
				break;
			case "Manager":
				if(grossSalaryPerMonth < 3000 || grossSalaryPerMonth > 5000) 
					throw new Exception("El salario de un Manager tiene que estar entre 3.000€-5.000€ brutos mensuales.");
				break;	
			case "Senior":
				if(grossSalaryPerMonth < 2700 || grossSalaryPerMonth > 4000) 
					throw new Exception("El salario de un Senior tiene que estar entre 2.700€-4.000€ brutos mensuales.");
				break;
			case "Mid":
				if(grossSalaryPerMonth < 1800 || grossSalaryPerMonth > 2500) 
					throw new Exception("El salario de un Mid tiene que estar entre 1.800€-2.500€ brutos mensuales.");
				break;
			case "Junior":
				if(grossSalaryPerMonth < 900 || grossSalaryPerMonth > 1600) 
					throw new Exception("El salario de un Junior tiene que estar entre 900€ y 1.600€ brutos mensuales.");
				break;
			default:
				throw new Exception("Revisa los valores introducidos.");
		}

				
		this.jobCategory = jobCategory;
		this.grossSalaryPerMonth = grossSalaryPerMonth;
		this.paymentRate = paymentRate;
		
		grossSalaryPerYear = grossSalaryPerMonth * 12;
	}
	

	// MÉTODOS A SOBREESCRIBIR DE LA CLASE ABSTRACT PADRE
	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(grossSalaryPerMonth);
	}
	
	
	@Override
	public String getDescription() {
		return null;
	}


	@Override
	public String toString() {
		String text = "\n\n**** Id: " + super.getId() + " ****\n" + 
			"Nombre: " + super.getName() + "\n" + 
			"Dirección: " + super.getAddress() + "\n" + 
			"Teléfono: " + super.getPhone() + "\n" + 
			"Categoría: " + super.getJobCategory() + "\n" + 
			"Sueldo bruto anual: " + grossSalaryPerYear + " €\n" + 
			"Sueldo bruto mensual: " + grossSalaryPerMonth + " €\n" +
			"Sueldo total por categoría: " + super.getTotalPaid() + " €\n" +
			"Bonus anual: " + bonus() + " €";
		return text;
	}
	
	// MÉTODOS PROPIOS DE LA CLASE
	
	public double bonus() {
		return grossSalaryPerYear * 0.10;
	}
	
}





