package ru.aston.hometask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static ru.aston.hometask.utils.ConstantUtils.FILE_NAME;
import static ru.aston.hometask.utils.ConstantUtils.FILE_NOT_FOUND_MSG;
import static ru.aston.hometask.utils.ConstantUtils.SEMICOLON_SEPARATOR;

import ru.aston.hometask.beans.Student;

public class Runner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new FileReader(FILE_NAME))) {
			List<Student> students = new ArrayList<>();
			while (sc.hasNextLine()) {
				String[] lines = sc.nextLine().split(SEMICOLON_SEPARATOR);
				students.add(new Student(lines));
			}
			students.stream().peek(System.out::println).map(student -> student.getBooks())
					.flatMap(books -> books.stream()).sorted().distinct().filter(book -> book.getReleaseDate() > 2000)
					.limit(3).map(book -> book.getReleaseDate()).findFirst()
					.ifPresentOrElse(System.out::println, () -> System.out.println("Book is not found"));

		} catch (FileNotFoundException e) {
			System.out.println(FILE_NOT_FOUND_MSG);
		}
	}
}