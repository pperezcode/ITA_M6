package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;
	protected double governmentSubsidy;
	
	public Volunteer(String name, String address, String phone, String description, double governmentSubsidy) throws Exception {
		super(name, address, phone);
		
		this.description = description;
		this.governmentSubsidy = governmentSubsidy;

		if(governmentSubsidy > 300) 
			throw new Exception("La ayuda m�xima que pueden recibir los voluntarios es de 300�.");
		jobCategory = "Volunteer";
		
	}

	
	// M�TODOS A SOBREESCRIBIR DE LA CLASE ABSTRACT PADRE

	@Override
	public void pay() {
		totalPaid = 0;
	}


	@Override
	public String getDescription() {
		return description;
	}


	@Override
	public String toString() {
		String text = "\n\n**** Id: " + super.getId() + " ****\n" + 
			"Nombre: " + super.getName() + "\n" + 
			"Direcci�n: " + super.getAddress() + "\n" + 
			"Tel�fono: " + super.getPhone() + "\n" + 
			"Categor�a: " + super.getJobCategory() + "\n" + 
			"Sueldo total:" + description + "\n" +
			"Subsidio gubernamental: " + governmentSubsidy + " �";
		return text;
	}

}
