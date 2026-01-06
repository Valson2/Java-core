package ru.aston.hometask.task;

public class Runner {

	private static int count = 1;
	private static final Object lock = new Object();

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			while (true) {
				synchronized (lock) {
					while (count != 1) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(count);
					count = 2;
					lock.notify();
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			while (true) {
				synchronized (lock) {
					while (count != 2) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(count);
					count = 1;
					lock.notify();
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}
