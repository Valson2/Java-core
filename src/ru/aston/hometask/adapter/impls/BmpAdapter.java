package ru.aston.hometask.adapter.impls;

import ru.aston.hometask.adapter.entities.BmpReader;
import ru.aston.hometask.adapter.interfaces.ImageLoader;

public class BmpAdapter implements ImageLoader {
	private final BmpReader bmpReader;

	public BmpAdapter(BmpReader bmpReader) {
		this.bmpReader = bmpReader;
	}

	@Override
	public void load(String file) {
		bmpReader.readBmpFile(file);
	}

	@Override
	public void display() {
		bmpReader.showImage();
	}
}
