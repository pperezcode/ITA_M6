package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		// Salario Boss mayor a 8000€
		//controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", "Boss", 6900.0);	// Validamos que se cumple la excepción
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", "Boss", 8500.0);

		
		// Salario Manager entre 3000€ y 5000€
		//controller.createManagerEmployee("María Manager", "Dirección molona 2", "665266666", "Manager", 2400.0);
		controller.createManagerEmployee("María Manager", "Dirección molona 2", "665266666", "Manager", 4000.0);
		//controller.createManagerEmployee("María Manager", "Dirección molona 2", "665266666", "Manager", 5400.0);

		
		// Salario Senior entre 2700€ y 4000€
		//controller.createEmployeeSenior("Laura Senior", "Dirección molona 3", "625266666", "Senior", 2500.0);
		controller.createEmployeeSenior("Laura Senior", "Dirección molona 3", "625266666", "Senior", 3000.0);
		//controller.createEmployeeSenior("Laura Senior", "Dirección molona 3", "625266666", "Senior", 4500.0);

		
		// Salario Mid entre 1800€ y 2500€
		//controller.createEmployeeMid("Juan Mid", "Dirección molona 4", "614266666", "Mid", 1500.0);
		controller.createEmployeeMid("Juan Mid", "Dirección molona 4", "614266666", "Mid", 2100.0);
		//controller.createEmployeeMid("Juan Mid", "Dirección molona 4", "614266666", "Mid", 3100.0);

		
		// Salario Junior entre 900€ y 1600€
		//controller.createEmployeeJunior("Ana Junior", "Dirección molona 2", "665226666", "Junior", 800.0);
		controller.createEmployeeJunior("Ana Junior", "Dirección molona 2", "665226666", "Junior", 1200.0);
		//controller.createEmployeeJunior("Ana Junior", "Dirección molona 2", "665226666", "Junior", 2300.0);

		
		// Voluntarios no cobran
		controller.createVolunteer("Pedro Junior", "Dirección molona 2", "665226666");

		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		
	}

}
