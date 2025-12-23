package ru.aston.hometask.proxy.entities;

public abstract class User {
	private final String name;
	private boolean access;

	public User(String name,boolean access) {
		this.name = name;
		this.access = access;
	}

	public String getName() {
		return name;
	}

	public boolean isAccess() {
		return access;
	}

}
