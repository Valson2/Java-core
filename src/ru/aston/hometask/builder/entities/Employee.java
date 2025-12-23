package ru.aston.hometask.builder.entities;

import static ru.aston.hometask.utils.ConstantUtils.SEMICOLON_SEPARATOR;

public class Employee {
	private final String fullName;
	private final String position;
	private final String department;
	private final double salary;
	private final String hireDate;
	private final boolean isActive;
	private final int yearsOfService;

	public Employee(EmployeeBuilder builder) {
		this.fullName = builder.fullName;
		this.position = builder.position;
		this.department = builder.department;
		this.salary = builder.salary;
		this.hireDate = builder.hireDate;
		this.isActive = builder.isActive;
		this.yearsOfService = builder.yearsOfService;
	}

	public String getFullName() {
		return fullName;
	}

	public static class EmployeeBuilder<T extends EmployeeBuilder<T>> {
		private String fullName;
		private String position;
		private String department;
		private double salary;
		private String hireDate;
		private boolean isActive;
		private int yearsOfService;

		public EmployeeBuilder(String fullName, String position) {
			this.fullName = fullName;
			this.position = position;
		}

		protected T self() {
			return (T) this;
		}

		public T department(String department) {
			this.department = department;
			return self();
		}

		public T salary(double salary) {
			this.salary = salary;
			return self();
		}

		public T hireDate(String hireDate) {
			this.hireDate = hireDate;
			return self();
		}

		public T isActive(boolean isActive) {
			this.isActive = isActive;
			return self();
		}

		public T yearsOfService(int yearsOfService) {
			this.yearsOfService = yearsOfService;
			return self();
		}

		public Employee build() {
			return new Employee(this);
		}
	}

	@Override
	public String toString() {
		return new StringBuilder().append(fullName).append(SEMICOLON_SEPARATOR).append(position)
				.append(SEMICOLON_SEPARATOR).append(department).append(SEMICOLON_SEPARATOR).append(salary)
				.append(SEMICOLON_SEPARATOR).append(hireDate).append(SEMICOLON_SEPARATOR).append(isActive)
				.append(SEMICOLON_SEPARATOR).append(yearsOfService).toString();
	}
}
