package h4_opdr4;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		Person persoon1 = new Person("Maarten", "Warson", "M", 26, 65F, 185F);
		Person persoon2 = new Person("Chelsea", "Huygen", "V", 19, 55F, 170F);
		Person persoon3 = new Person("Jan", "Penders", "M", 25, 60F, 175F);
		Person[] personen = {persoon1, persoon2, persoon3};
		
		System.out.println("*** ENKEL VROUWEN ***");
		Stream.of(personen)
		 	  .filter(person -> person.getGeslacht() == "V")
		 	  .forEach(System.out::println);
		System.out.println();
		
		System.out.println("*** PERSONEN OUDER DAN 20 JAAR ***");
		Stream.of(personen)
		 	  .filter(person -> person.getLeeftijd() > 20)
		 	  .forEach(System.out::println);
		System.out.println();
		
		System.out.println("*** PERSONEN TUSSEN 60 EN 70 KG ***");
		Stream.of(personen)
		  	  .filter(person -> person.getGewicht() > 60)
		  	  .filter(person -> person.getGewicht() < 70)
		  	  .forEach(System.out::println);
		System.out.println();
		
		System.out.println("*** LEEFTIJDEN VAN PERSONEN ***");
		Stream.of(personen)
		 	  .mapToInt(person -> person.getLeeftijd())
		 	  .forEach(System.out::println);
		System.out.println();
		
		System.out.println("*** VOOR- EN ACHTERNAMEN ***");
		Stream.of(personen)
		 	  .map(person -> person.getVoornaam() + " " + person.getAchternaam())
		 	  .forEach(System.out::println);
		System.out.println();
		
		System.out.println("*** GEMIDDELDE LEEFTIJD ***");
		OptionalDouble gemLeeftijd = Stream.of(personen)
				 						   .mapToInt(person -> person.getLeeftijd())
				 						   .average();
		if (gemLeeftijd.isPresent()) {
			System.out.println(gemLeeftijd.getAsDouble());
		} else {
			System.out.println("No result");
		}
		System.out.println();
		
		System.out.println("*** MINIMUM LEEFTIJD ***");
		OptionalInt minLeeftijd = Stream.of(personen)
				 						   .mapToInt(person -> person.getLeeftijd())
				 						   .min();
		if (minLeeftijd.isPresent()) {
			System.out.println(minLeeftijd.getAsInt());
		} else {
			System.out.println("No result");
		}
		System.out.println();
		
		System.out.println("*** MAXIMUM LEEFTIJD ***");
		OptionalInt maxLeeftijd = Stream.of(personen)
				 						   .mapToInt(person -> person.getLeeftijd())
				 						   .max();
		if (maxLeeftijd.isPresent()) {
			System.out.println(maxLeeftijd.getAsInt());
		} else {
			System.out.println("No result");
		}
		System.out.println();
		
		System.out.println("*** GEWICHTEN ***");
		Stream.of(personen)
		 	  .map(person -> person.getGewicht())
		 	  .forEach(System.out::println);
		System.out.println();
		
		System.out.println("*** GEMIDDELD GEWICHT ***");
		OptionalDouble gemGewicht = Stream.of(personen)
				 						   .mapToInt(person -> (int) person.getGewicht())
				 						   .average();
		if (gemGewicht.isPresent()) {
			System.out.println(gemGewicht.getAsDouble());
		} else {
			System.out.println("No result");
		}
		System.out.println();
		
		System.out.println("*** MINIMUM GEWICHT ***");
		OptionalInt minGewicht = Stream.of(personen)
				 						   .mapToInt(person -> (int) person.getGewicht())
				 						   .min();
		if (minGewicht.isPresent()) {
			System.out.println(minGewicht.getAsInt());
		} else {
			System.out.println("No result");
		}
		System.out.println();
		
		System.out.println("*** MAXIMUM GEWICHT ***");
		OptionalInt maxGewicht = Stream.of(personen)
				 						   .mapToInt(person -> (int) person.getGewicht())
				 						   .max();
		if (maxGewicht.isPresent()) {
			System.out.println(maxGewicht.getAsInt());
		} else {
			System.out.println("No result");
		}
		System.out.println();
	}
}
