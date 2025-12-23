package ru.aston.hometask.adapter;

import ru.aston.hometask.adapter.entities.BmpReader;
import ru.aston.hometask.adapter.entities.PngReader;
import ru.aston.hometask.adapter.impls.BmpAdapter;
import ru.aston.hometask.adapter.impls.PngAdapter;
import ru.aston.hometask.adapter.interfaces.ImageLoader;

public class Runner {
	public static void main(String[] args) {
		ImageLoader bmp = new BmpAdapter(new BmpReader());
		ImageLoader png = new PngAdapter(new PngReader());

		bmp.load("bmp.txt");
		png.load("png.txt");

		bmp.display();
		png.display();
	}
}
