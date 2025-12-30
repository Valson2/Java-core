package ru.aston.hometask.task;

import java.util.concurrent.atomic.AtomicInteger;

public class Runner {

	static class Counter {
		private volatile AtomicInteger value = new AtomicInteger(1);

		public void increment() {
			value.incrementAndGet();
		}

		public void decrement() {
			value.decrementAndGet();
		}
	}

	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread thread1 = new Thread(() -> {
			while (true) {
				if (counter.value.get() == 1) {
					System.out.println(counter.value);
					counter.increment();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread thread2 = new Thread(() -> {
			while (true) {
				if (counter.value.get() == 2) {
					System.out.println(counter.value);
					counter.decrement();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		thread1.start();
		thread2.start();

	}
}
