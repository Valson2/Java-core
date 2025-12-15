package ru.aston.hometask;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static ru.aston.hometask.utils.ConstantUtils.FILE_NAME;
import static ru.aston.hometask.utils.ConstantUtils.FILE_NOT_FOUND_MSG;
import static ru.aston.hometask.utils.ConstantUtils.SEMICOLON_SEPARATOR;

import ru.aston.hometask.beans.Student;
import ru.aston.hometask.utils.FileParser;

public class Runner {

	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
			List<Student> students = new ArrayList<>();
			for (String line : lines) {
				String[] splitLine = line.split(SEMICOLON_SEPARATOR);
				Student student = FileParser.parseStudentFromFile(splitLine);
				students.add(student);
			}
			students.stream()
			.peek(System.out :: println)
			.map(student -> student.getBooks())
			.flatMap(books -> books.stream())
			.sorted()
			.distinct()
			.filter(book -> book.getReleaseDate() > 2000)
			.limit(3)
			.map(book -> book.getReleaseDate())
			.findFirst()
			.ifPresentOrElse(System.out::println, () -> System.out.println("Book is not found"));
		} catch (FileNotFoundException e) {
			System.err.println(FILE_NOT_FOUND_MSG);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}