package ru.aston.hometask.livelock;

public class Person {
	private String name;

	private boolean isReadyHoldOut = false;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setReadyHoldOut(boolean isFirstHoldOut) {
		this.isReadyHoldOut = isFirstHoldOut;
	}

	public void handshake(Person person) {
		while (!person.isReadyHoldOut) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out
					.println(Thread.currentThread().getName() + "Waiting until  " + person.name + " hold his hand out");
		}
		System.out.println(name + " Hold out hand");
		isReadyHoldOut = true;
	}
}
