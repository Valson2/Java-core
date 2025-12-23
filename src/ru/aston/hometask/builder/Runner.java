package ru.aston.hometask.builder;

import ru.aston.hometask.builder.entities.Employee;
import ru.aston.hometask.builder.entities.Manager;

public class Runner {
	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder<>("Valentin Zhernosek","Developer")
				.department("It")
				.salary(150000)
				.hireDate("2021-12-09")
				.isActive(true)
				.yearsOfService(2)
				.build();
		System.out.println(employee);
		Manager manager = new Manager.ManagerBuilder("Ivan Petrov","Manager")
				.department("It")
				.salary(300000)
				.hireDate("2020-10-06")
				.isActive(true)
				.yearsOfService(10)
				.teamSize(34)
				.build();
		System.out.println(manager);
	}
}
