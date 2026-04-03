package ru.aston.hometask.beans;

import static ru.aston.hometask.util.ConstantUtility.SEMICOLON_SEPARATOR;
import static ru.aston.hometask.util.ConstantUtility.MEASURE_UNIT;

public final class Circle {
	private final Point point;
	private final int radius;

	public Circle(Point point, int radius) {
		this.point = point.clone();
		this.radius = radius;
	}

	public Point getPoint() {
		return point.clone();
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return point + SEMICOLON_SEPARATOR + radius + MEASURE_UNIT;
	}
}
