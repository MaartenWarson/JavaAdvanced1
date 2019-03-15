package h5_opdr4;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		NavigableSet<String> text = new TreeSet<>();
		
		System.out.println("Geef 5 woorden in:");
		for(int i = 0; i < 5; i++) {
			text.add(keyboard.nextLine());
		}
		
		text.forEach(System.out::println);
		System.out.println("Alfabetisch eerste woord: " + text.first());
		System.out.println("Alfabetisch laatste woord: " + text.last());

		keyboard.close();

	}

}
