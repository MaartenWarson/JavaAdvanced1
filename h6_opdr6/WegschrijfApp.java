package h6_opdr6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;

public class WegschrijfApp {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1993, Month.FEBRUARY,3);
		Person person = new Person("Maarten", "Warson", date);
		
		try(FileOutputStream file = new FileOutputStream(person.getFirstName() + ".txt");
			ObjectOutputStream out = new ObjectOutputStream(file)) {
			out.writeObject(person);
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
