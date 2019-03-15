package h8_opdr1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Geef een getal in:");
			
			int getal = keyboard.nextInt();
			System.out.println(getal*getal);
			
			keyboard.close();
		} catch(InputMismatchException ex) {
			System.out.println("Je hebt geen getal ingegeven!");
		}
	}

}
