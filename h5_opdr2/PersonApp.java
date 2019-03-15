package h5_opdr2;

import java.util.HashSet;
import java.util.Set;

public class PersonApp {

	public static void main(String[] args) {
		Set<Person> personenLijst = new HashSet<>();
		Person persoon1 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon2 = new Person("Chelsea", "Huygen", "V", 19, 55, 170);
		Person persoon3 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon4 = new Person("Emiel", "Warson", "M", 2, 20, 100);
		
		personenLijst.add(persoon1);
		personenLijst.add(persoon2);
		personenLijst.add(persoon3);
		personenLijst.add(persoon4);
		
		personenLijst.forEach(System.out::println);
	}
}
