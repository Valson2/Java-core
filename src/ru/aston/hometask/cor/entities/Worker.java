package ru.aston.hometask.cor.entities;

public class Worker {
	private final String name;
	private final Tool tool;

	public Worker(String name, Tool tool) {
		this.name = name;
		this.tool = tool;
	}

	public String getName() {
		return name;
	}

	public Tool getTool() {
		return tool;
	}

}
