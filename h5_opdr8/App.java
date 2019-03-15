package h5_opdr8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Person persoon1 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon2 = new Person("Chelsea", "Huygen", "V", 19, 55, 170);
		Person persoon3 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon4 = new Person("Emiel", "Warson", "M", 2, 20, 100);
		Person persoon5 = new Person("Adam", "Tada", "M", 5, 40, 120);
		
		List<Person> personenLijst = new ArrayList<>();
		personenLijst.add(persoon1);
		personenLijst.add(persoon2);
		personenLijst.add(persoon3);
		personenLijst.add(persoon4);
		personenLijst.add(persoon5);
		
		//Sorteert alfabetisch
		personenLijst.sort(Comparator.naturalOrder());
		personenLijst.forEach(System.out::println);
		
		//Sorteren op basis van gewicht ??
		//personenLijst.sort(Comparator.comparingInt(Person::getGewicht()));
		personenLijst.forEach(System.out::println);

	}

}
