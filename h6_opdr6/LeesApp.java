package h6_opdr6;

import java.io.*;

public class LeesApp {

	public static void main(String[] args) {
		try(FileInputStream file = new FileInputStream("Maarten.txt");
			ObjectInputStream in = new ObjectInputStream(file)) {
			Person text = (Person) in.readObject();
			System.out.println(text);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
