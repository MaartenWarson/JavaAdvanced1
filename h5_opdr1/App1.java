package h5_opdr1;

import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		
		System.out.println("Geef 5 getallen in:");
		for(int i = 0; i < 5; i++) {
			list.add(keyboard.nextInt());
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
