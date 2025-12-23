package ru.aston.hometask.decorator;

import ru.aston.hometask.decorator.entities.SimpleImage;
import ru.aston.hometask.decorator.impls.BorderDecorator;
import ru.aston.hometask.decorator.interfaces.Image;

public class Runner {
	public static void main(String[] args) {
		Image image = new SimpleImage("png.txt", 100, 100);
		Image decorator = new BorderDecorator(image,10,"red");
		System.out.println(decorator.displayImage());
	}
}
