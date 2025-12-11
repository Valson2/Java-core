package ru.aston.hometask.beans;

import static ru.aston.hometask.util.ConstantUtility.COLON_SEPARATOR;
import static ru.aston.hometask.util.ConstantUtility.SEMICOLON_SEPARATOR;;

public class Point implements Cloneable {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public Point clone() {
		try {
			return (Point) super.clone();
		} catch (CloneNotSupportedException e) {
			return new Point(x, y);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + COLON_SEPARATOR + x + SEMICOLON_SEPARATOR + y;
	}
}
