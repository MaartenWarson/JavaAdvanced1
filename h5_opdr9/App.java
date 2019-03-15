package h5_opdr9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Person persoon1 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon2 = new Person("Chelsea", "Huygen", "V", 22, 55, 170);
		Person persoon3 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon4 = new Person("Emiel", "Warson", "M", 2, 20, 100);
		Person persoon5 = new Person("Adam", "Tada", "V", 5, 40, 120);
		
		List<Person> personenLijst = new ArrayList<>();
		personenLijst.add(persoon1);
		personenLijst.add(persoon2);
		personenLijst.add(persoon3);
		personenLijst.add(persoon4);
		personenLijst.add(persoon5);
		
		List<Person> nieuweLijst = personenLijst.stream()
				 								.filter(person -> person.getGeslacht() == "V")
				 								.filter(person -> person.getLeeftijd() > 20)
				 								.sorted()
				 								.collect(Collectors.toList());
		nieuweLijst.forEach(System.out::println);
	}

}
