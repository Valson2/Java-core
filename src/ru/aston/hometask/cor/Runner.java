package ru.aston.hometask.cor;

import ru.aston.hometask.cor.entities.Tool;
import ru.aston.hometask.cor.entities.Wall;
import ru.aston.hometask.cor.entities.Wall.Material;
import ru.aston.hometask.cor.entities.Worker;
import ru.aston.hometask.cor.handlers.BreakWallHandler;

public class Runner {
	public static void main(String[] args) {
		Worker worker = new Worker("Vasya", new Tool("Hammer", 5));

		BreakWallHandler breakWallHandler = new BreakWallHandler(worker);

		breakWallHandler.setNext(new BreakWallHandler(new Worker("Dima", new Tool("Screw", 3))))
				.setNext(new BreakWallHandler(new Worker("Dima", new Tool("Screw", 40))))
				.setNext(new BreakWallHandler(new Worker("Dima", new Tool("Screw", 7))))
				.setNext(new BreakWallHandler(new Worker("Dima", new Tool("Screw", 45))))
				.setNext(new BreakWallHandler(new Worker("Dima", new Tool("Screw", 3))))
				.setNext(new BreakWallHandler(new Worker("Dima", new Tool("Screw", 8))));

		breakWallHandler.breakWall(new Wall(10, Material.CARTON));
		breakWallHandler.breakWall(new Wall(1, Material.BRICK));
	}
}
