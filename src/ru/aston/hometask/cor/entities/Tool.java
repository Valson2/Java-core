package ru.aston.hometask.cor.entities;

public class Tool {
	private final String name;
	private final int power;

	public Tool(String name, int power) {
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

}
