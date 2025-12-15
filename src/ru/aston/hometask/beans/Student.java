package ru.aston.hometask.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import static ru.aston.hometask.utils.ConstantUtils.SEMICOLON_SEPARATOR;
import static ru.aston.hometask.utils.ConstantUtils.NEW_LINE_CHAR;

public class Student {

	private final String firstName;
	private final String lastName;
	private final int age;
	private final List<Book> books = new ArrayList<>();

	public Student(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public List<Book> getBooks() {
		return books;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, books, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(books, other.books) && age == other.age && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(firstName + SEMICOLON_SEPARATOR + lastName + SEMICOLON_SEPARATOR + age + NEW_LINE_CHAR);
		for (Book book : books) {
			str.append(book).append(NEW_LINE_CHAR);
		}
		return str.toString();
	}

}
