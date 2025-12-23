package ru.aston.hometask.decorator.impls;

import ru.aston.hometask.decorator.interfaces.Image;

public class BorderDecorator extends ImageDecorator {
	private int borderSize;
	private String color;

	public BorderDecorator(Image image, int borderSize, String color) {
		super(image);
		this.borderSize = borderSize;
		this.color = color;
	}

	@Override
	public String displayImage() {
		return super.displayImage() + "Border adds successfull: " + borderSize + ":" + color;
	}

	@Override
	public int getWidth() {
		return super.getWidth() + 2 * borderSize;
	}

	@Override
	public int getHeight() {
		return super.getHeight() + 2 * borderSize;
	}
}
