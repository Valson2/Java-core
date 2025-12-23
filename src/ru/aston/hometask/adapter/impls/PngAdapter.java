package ru.aston.hometask.adapter.impls;

import ru.aston.hometask.adapter.entities.PngReader;
import ru.aston.hometask.adapter.interfaces.ImageLoader;

public class PngAdapter implements ImageLoader {
	private PngReader pngReader;

	public PngAdapter(PngReader pngReader) {
		super();
		this.pngReader = pngReader;
	}

	@Override
	public void load(String file) {
		pngReader.decode(file);
	}

	@Override
	public void display() {
		pngReader.display();
	}

}
