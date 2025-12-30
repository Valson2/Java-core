package ru.aston.hometask.livelock;

public class Runner {
	public static void main(String[] args) {
		Person vanya = new Person("vanya");
		Person stepan = new Person("Stepan");

		Thread t1 = new Thread(() -> vanya.handshake(stepan));
		Thread t2 = new Thread(() -> stepan.handshake(vanya));
		
		t1.start();
		t2.start();
	}
}
