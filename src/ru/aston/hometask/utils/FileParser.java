package ru.aston.hometask.utils;

import static ru.aston.hometask.utils.ConstantUtils.COMMA_SEPARATOR;
import static ru.aston.hometask.utils.ConstantUtils.EXLUDE_BOOKS_FIELDS_AMOUNT;
import static ru.aston.hometask.utils.ConstantUtils.FIFTH_FILE_ELEMENT;
import static ru.aston.hometask.utils.ConstantUtils.FIRST_FILE_ELEMENT;
import static ru.aston.hometask.utils.ConstantUtils.FORMATTER;
import static ru.aston.hometask.utils.ConstantUtils.FOURTH_FILE_ELEMENT;
import static ru.aston.hometask.utils.ConstantUtils.SECOND_FILE_ELEMENT;
import static ru.aston.hometask.utils.ConstantUtils.SIXTH_FILE_ELEMENT;
import static ru.aston.hometask.utils.ConstantUtils.THIRD_FILE_ELEMENT;

import java.time.LocalDate;

import ru.aston.hometask.beans.Author;
import ru.aston.hometask.beans.Book;
import ru.aston.hometask.beans.Student;

public class FileParser {
	public static Student parseStudentFromFile(String[] lines) {
		Student student = new Student(lines[FIRST_FILE_ELEMENT], lines[SECOND_FILE_ELEMENT],
				Integer.parseInt(lines[THIRD_FILE_ELEMENT]));
		for (int i = EXLUDE_BOOKS_FIELDS_AMOUNT; i < lines.length; i++) {
			student.addBook(parseBookFromFile(lines[i].split(COMMA_SEPARATOR)));
		}
		return student;
	}

	private static Book parseBookFromFile(String[] lines) {
		return new Book(lines[FIRST_FILE_ELEMENT],
				new Author(lines[SECOND_FILE_ELEMENT], lines[THIRD_FILE_ELEMENT],
						LocalDate.parse(lines[FOURTH_FILE_ELEMENT], FORMATTER)),
				Integer.parseInt(lines[FIFTH_FILE_ELEMENT]), Integer.parseInt(lines[SIXTH_FILE_ELEMENT]));
	}
}
