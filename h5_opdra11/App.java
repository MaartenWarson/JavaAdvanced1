package h5_opdra11;

import java.util.SortedMap;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Person persoon1 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon2 = new Person("Chelsea", "Huygen", "V", 22, 55, 170);
		Person persoon3 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon4 = new Person("Emiel", "Warson", "M", 2, 20, 100);
		Person persoon5 = new Person("Adam", "Tada", "V", 5, 40, 120);
		
		SortedMap<String, Person> lijst = new TreeMap<>();
		lijst.put(persoon1.getVoornaam(), persoon1);
		lijst.put(persoon2.getVoornaam(), persoon2);
		lijst.put(persoon3.getVoornaam(), persoon3);
		lijst.put(persoon4.getVoornaam(), persoon4);
		lijst.put(persoon5.getVoornaam(), persoon5);
		
		System.out.println("*** LIJST PERSONEN ***");
		lijst.forEach((k,v) -> System.out.println(k + ": " + v));
		System.out.println();
		
		//Persoon zoeken op naam
		System.out.println(lijst.get("Maarten"));
		System.out.println();
		
		String key1 = lijst.firstKey();
		System.out.println(lijst.get(key1));
		String key2 = lijst.lastKey();
		System.out.println(lijst.get(key2));

	}

}
