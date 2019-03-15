package h6_opdr6;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Person implements Serializable{
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	
	public Person(String firstname, String lastname, LocalDate birthday) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.birthday = birthday;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public String toString() {
		return firstName + " " + lastName + " " + birthday.toString();
	}
	
}
