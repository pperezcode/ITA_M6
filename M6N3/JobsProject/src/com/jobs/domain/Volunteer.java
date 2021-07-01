package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;
	protected double governmentSubsidy;
	
	public Volunteer(String name, String address, String phone, String description, double governmentSubsidy) throws Exception {
		super(name, address, phone);
		
		this.description = description;
		this.governmentSubsidy = governmentSubsidy;

		if(governmentSubsidy > 300) 
			throw new Exception("La ayuda máxima que pueden recibir los voluntarios es de 300€.");
		jobCategory = "Volunteer";
		
	}

	
	// MÉTODOS A SOBREESCRIBIR DE LA CLASE ABSTRACT PADRE

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
			"Dirección: " + super.getAddress() + "\n" + 
			"Teléfono: " + super.getPhone() + "\n" + 
			"Categoría: " + super.getJobCategory() + "\n" + 
			"Sueldo total:" + description + "\n" +
			"Subsidio gubernamental: " + governmentSubsidy + " €";
		return text;
	}

}
