package com.jobs.application;

import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);		
	}
		
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createVolunteer(String name, String address, String phone) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone, "¡Los voluntarios no cobran!");
		repository.addMember(volunteer);	
	}

	
	public void payAllEmployeers() {
		for (int i = 0; i < repository.getAllMembers().size(); i++) {
			repository.getAllMembers().get(i).pay();
		}			
	}

	
	public String getAllEmployees() {
		String textEmployees = "";
		
		for (int i = 0; i < repository.getAllMembers().size(); i++) {
			textEmployees += repository.getAllMembers().get(i).toString();
		}

		return textEmployees;
	}
	
}
