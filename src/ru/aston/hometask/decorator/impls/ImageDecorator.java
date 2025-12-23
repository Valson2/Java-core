package ru.aston.hometask.decorator.impls;

import ru.aston.hometask.decorator.interfaces.Image;

public abstract class ImageDecorator implements Image {
	private Image image;

	public ImageDecorator(Image image) {
		super();
		this.image = image;
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public String displayImage() {
		return image.displayImage() + displaySize();
	}

	protected String displaySize() {
		return "Size: " + getHeight() + ":" + getWidth();
	}
}
