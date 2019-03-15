package h5_opdr7;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import h5_opdr2.Person;

public class App {

	//OPDRACHT WERKT NIET!!!! Bij theorie kijken vanaf p. 82
	public static void main(String[] args) {
		Set<Person> personenLijst = new HashSet<>();
		Person persoon1 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon2 = new Person("Chelsea", "Huygen", "V", 19, 55, 170);
		Person persoon3 = new Person("Maarten", "Warson", "M", 26, 65, 185);
		Person persoon4 = new Person("Emiel", "Warson", "M", 2, 20, 100);
		Person persoon5 = new Person("Adam", "Tada", "M", 5, 40, 120);
		
		personenLijst.add(persoon1);
		personenLijst.add(persoon2);
		personenLijst.add(persoon3);
		personenLijst.add(persoon4);
		personenLijst.add(persoon5);
		
		personenLijst.forEach(System.out::println);
		System.out.println();
		
		SortedSet<Person> personenLijstTree = new TreeSet<>((p1, p2) -> p1.getLeeftijd() - p2.getLeeftijd());
		personenLijstTree.add(persoon1);
		personenLijstTree.add(persoon2);
		personenLijstTree.add(persoon3);
		personenLijstTree.add(persoon4);
		personenLijstTree.add(persoon5);
		personenLijstTree.forEach(System.out::println);

	}

}
