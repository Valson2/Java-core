package ru.aston.hometask.cor.handlers;

import ru.aston.hometask.cor.entities.Tool;
import ru.aston.hometask.cor.entities.Wall;
import ru.aston.hometask.cor.entities.Worker;

public class BreakWallHandler {
	private Worker worker;
	private BreakWallHandler next;

	public BreakWallHandler(Worker worker) {
		super();
		this.worker = worker;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public BreakWallHandler setNext(BreakWallHandler next) {
		this.next = next;
		return next;
	}

	private void checkNext(Wall wall) {
		if (next != null) {
			next.breakWall(wall);
		}
	}

	public void breakWall(Wall wall) {
		Tool tool = worker.getTool();
		if (tool.getPower() >= wall.getEndurance()) {
			System.out.println("Successfull breaking wall");
		} else {
			System.out.println(
					"Too low power: " + tool.getPower() + " .Must be equal or more than: " + wall.getEndurance());
			checkNext(wall);
		}
	}

}
