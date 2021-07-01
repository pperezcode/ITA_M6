package com.jobs.domain;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected String jobCategory;
	protected double totalPaid=0;
	
	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();
		
		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}
	
	
	// GETTERS
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}
	
	public String getJobCategory() {
		return jobCategory;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	
	// MÉTODOS ABSTRACTOS A IMPLEMENTAR EN LAS CLASSES QUE HEREDAN
	
	public abstract void pay();
	
	public abstract String getDescription();
	
	public abstract String toString();
}
