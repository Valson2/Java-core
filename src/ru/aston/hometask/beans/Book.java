package ru.aston.hometask.beans;

import java.util.Objects;
import static ru.aston.hometask.utils.ConstantUtils.SEMICOLON_SEPARATOR;

public class Book implements Comparable<Book> {
	private final String name;
	private final Author author;
	private final int releaseDate;
	private final int pagesAmount;

	public Book(String name, Author author, int releaseDate, int pageAmount) {
		this.name = name;
		this.author = author;
		this.releaseDate = releaseDate;
		this.pagesAmount = pageAmount;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public int getPagesAmount() {
		return pagesAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, name, pagesAmount, releaseDate);
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
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(name, other.name)
				&& pagesAmount == other.pagesAmount && releaseDate == other.releaseDate;
	}

	@Override
	public String toString() {
		return name + SEMICOLON_SEPARATOR + author + SEMICOLON_SEPARATOR + releaseDate + SEMICOLON_SEPARATOR
				+ pagesAmount;
	}

	@Override
	public int compareTo(Book book) {
		return pagesAmount - book.pagesAmount;
	}

}
