package h5_opdr2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een woord in (eindig met een punt om invoer te stoppen:");
		String woord = keyboard.nextLine();
		Set<String> list = new HashSet<>();
		list.add(woord);
		
		while(woord.charAt(woord.length() - 1) != '.') {
			woord = keyboard.nextLine();
			list.add(woord);
		}
		
		System.out.println("Aantal woorden: " + list.size());
		
		System.out.println("*** Woordenarray ***");
		String[] woordenArray = list.toArray(new String[0]);
		
		for(String w : woordenArray) {
			System.out.println(w);
		}
		
		keyboard.close();

	}

}
