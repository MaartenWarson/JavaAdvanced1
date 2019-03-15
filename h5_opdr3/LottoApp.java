package h5_opdr3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Set<Integer> lottoNummers = new LinkedHashSet<>();
		
		int getal;
		while(lottoNummers.size() < 6) {
			System.out.println("Geef een uniek getal in: ");
			getal = keyboard.nextInt();
			
			if(getal > 0 && getal < 46) {
				lottoNummers.add(getal);
			}
		}
		
		Set<Integer> eigenNummers = new HashSet<>();
		Random rand = new Random();
		
		while(eigenNummers.size() < 6) {
			int nr = rand.nextInt(46) + 1; //Tot 46 vanaf 1 te beginnen tellen
			eigenNummers.add(nr);
		}
		
		/*in lottoNummers enkel de nummers behouden die overeenkomen met die van eigenNummers*/
		lottoNummers.retainAll(eigenNummers);
		System.out.println("Winnende nummers: " + lottoNummers);
		
		keyboard.close();
	}

}
