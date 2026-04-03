package ru.aston.hometask;

import ru.aston.hometask.beans.Circle;
import ru.aston.hometask.beans.Point;

public class Runner {
	public static void main(String[] args) {
		Point point = new Point(23, 22);
		System.out.println(point);

		Circle circle = new Circle(point, 434);
		System.out.println(circle);

		circle.getPoint().setX(2);
		System.out.println(circle);

		point.setX(34);
		System.out.println(circle);
	}
}
