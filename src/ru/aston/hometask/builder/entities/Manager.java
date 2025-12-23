package ru.aston.hometask.builder.entities;

public class Manager extends Employee {
	private final int teamSize;

	public Manager(ManagerBuilder builder) {
		super(builder);
		this.teamSize = builder.teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public static class ManagerBuilder extends EmployeeBuilder<ManagerBuilder> {
		private int teamSize;

		public ManagerBuilder(String fullName, String position) {
			super(fullName, position);
		}

		public ManagerBuilder teamSize(int teamSize) {
			this.teamSize = teamSize;
			return this;
		}

		@Override
		public Manager build() {
			return new Manager(this);
		}
	}

	@Override
	public String toString() {
		final String semicolonSeparator = ";";
		return super.toString() + semicolonSeparator + teamSize;
	}
}