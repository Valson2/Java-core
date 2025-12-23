package ru.aston.hometask.decorator.entities;

import ru.aston.hometask.decorator.interfaces.Image;

public class SimpleImage implements Image {
	private String filename;
	private int width;
	private int height;

	public SimpleImage(String filename, int width, int height) {
		this.filename = filename;
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public String displayImage() {
		return "Displayed " + filename;
	}
}