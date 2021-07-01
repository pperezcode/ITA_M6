package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;
		
		this.jobCategory = "Volunteer";
		
	}

	
	// MÉTODOS A SOBREESCRIBIR DE LA CLASE ABSTRACT PADRE

	@Override
	public void pay() {
		totalPaid = 0;
	}


	@Override
	public double getSalaryPerMonth() {
		return 0;
	}


	@Override
	public String getDescription() {
		return description;
	}


	@Override
	public String toString() {
		String text = "\n\n**** Id: " + super.getId() + " ****\nNombre: " + super.getName() + "\nDirección: " + super.getAddress() + 
				"\nTeléfono: " + super.getPhone() + "\nCategoría: " + super.getJobCategory() + "\nSueldo: " + description;
		return text;
	}

}
