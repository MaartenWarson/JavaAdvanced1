package h4_opdr1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		String[] words = {"Hello", "this", "is", "an", "example", "of", "streams"};
		Person persoon1 = new Person("Maarten", "Warson", "M", 26, 65F, 185F);
		Person persoon2 = new Person("Chelsea", "Huygen", "V", 19, 55F, 170F);
		Person persoon3 = new Person("Jan", "Penders", "M", 25, 60F, 175F);
		Person[] personen = {persoon1, persoon2, persoon3};
		
		Stream.of(words)
		 	  .forEach(System.out::println);
		
		IntStream.range(0, 100)
		 		 .forEach(System.out::println);
		
		Stream.of(personen)
		 	  .forEach(System.out::println);
	}

}
