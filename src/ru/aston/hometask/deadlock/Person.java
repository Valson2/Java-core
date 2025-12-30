package ru.aston.hometask.deadlock;

public class Person {
	private final String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public synchronized void goThrough(Person person) {
		System.out.println(Thread.currentThread().getName() + ": " + person.name + " get out!!");
		person.goThrough(this);
		System.out.println(name + " go through " + person.name);
	}
}