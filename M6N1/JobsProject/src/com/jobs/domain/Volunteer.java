package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;	
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
	public String getDescripcio() {
		return description;
	}

	@Override
	public String toString() {
		String text = "\n\n**** Id: " + super.getId() + " ****\nNombre: " + super.getName() +
				"\nDirección: " + super.getAddress() + "\nTeléfono: " + super.getPhone() +
				"\nSueldo: " + description;
		return text;
	}

}
