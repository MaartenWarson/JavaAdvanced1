package h5_opdr2;

import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.Set;

public class App1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Set<Integer> list = new HashSet<>();
		
		System.out.println("Geef 5 getallen in:");
		for(int i = 0; i < 5; i++) {
			list.add(keyboard.nextInt()); //Moeten uniek zijn (en random volgorde)
		}
		System.out.println("*** Afdruk van de lijst ***");
		list.forEach(System.out::println);
		
		int sum = list.stream()
					  .mapToInt(Integer::intValue)
					  .sum();
		System.out.println("Som: " + sum);
		
		OptionalDouble average = list.stream()
				 		   			 .mapToInt(Integer::intValue)
				 		   			 .average();
		if(average.isPresent()) {
			System.out.println("Gemiddelde: " + average.getAsDouble());
		} else {
			System.out.println("No result");
		}
		
		keyboard.close();

	}

}
