package h5_opdr1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een woord in (eindig met een punt om invoer te stoppen:");
		String woord = keyboard.nextLine();
		List<String> list = new ArrayList<>();
		list.add(woord);
		
		while(woord.charAt(woord.length() - 1) != '.') {
			woord = keyboard.nextLine();
			list.add(woord);
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
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
