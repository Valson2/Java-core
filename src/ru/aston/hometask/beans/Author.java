package ru.aston.hometask.beans;

import java.time.LocalDate;
import java.util.Objects;
import static ru.aston.hometask.utils.ConstantUtils.SEMICOLON_SEPARATOR;

public class Author {
	private final String firstName;
	private final String lastName;
	private final LocalDate birthday;

	public Author(String firstName, String lastName, LocalDate birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
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
		Author other = (Author) obj;
		return Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return firstName + SEMICOLON_SEPARATOR + lastName + SEMICOLON_SEPARATOR + birthday;
	}

}
