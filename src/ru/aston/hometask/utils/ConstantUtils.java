package ru.aston.hometask.utils;

import java.time.format.DateTimeFormatter;

import ru.aston.hometask.beans.Student;

public abstract class ConstantUtils {
	public final static String SEMICOLON_SEPARATOR = ";";
	public final static String FILE_NAME = "src/resources/students.txt";
	public final static String FILE_NOT_FOUND_MSG = "File is not found";
	public final static String COMMA_SEPARATOR = ",";
	public final static String NEW_LINE_CHAR = "\n";
	private final static String DATE_FORMAT = "dd.MM.yyyy";
	public final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
	public final static int EXLUDE_BOOKS_FIELDS_AMOUNT = Student.class.getDeclaredFields().length - 1;
	public final static int FIRST_FILE_ELEMENT = 0;
	public final static int SECOND_FILE_ELEMENT = 1;
	public final static int THIRD_FILE_ELEMENT = 2;
	public final static int FOURTH_FILE_ELEMENT = 3;
	public final static int FIFTH_FILE_ELEMENT = 4;
	public final static int SIXTH_FILE_ELEMENT = 5;
}
