package h4_opdr2;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		int[] getallen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] tekenreeks = {"Hallo", "allemaal", "en", "welkom", "bij", "java"};
		
		long aantal = IntStream.of(getallen).count();
		System.out.println("Aantal getallen: " + aantal);
		
		OptionalInt max = IntStream.of(getallen).max();
		if (max.isPresent()) {
			System.out.println("Maximum: " + max.getAsInt());
		} else {
			System.out.println("No result");
		}
		
		OptionalInt min = IntStream.of(getallen).min();
		if (min.isPresent()) {
			System.out.println("Minimum: " + min.getAsInt());
		} else {
			System.out.println("No result");
		}
		
		OptionalDouble gemiddelde = IntStream.of(getallen).average();
		if (gemiddelde.isPresent()) {
			System.out.println("Gemiddelde: " + gemiddelde.getAsDouble());
		} else {
			System.out.println("No result");
		}
		
		int sum = IntStream.of(getallen).sum();
		System.out.println("Som: " + sum);
		
		int sumSquared = IntStream.of(getallen).reduce(0,  (acc, el) -> acc + (el * el));
		System.out.println("Som van kwadraten: " + sumSquared);
		
		String result = Stream.of(tekenreeks).reduce("", (acc, el) -> acc + el + ";");
		System.out.println("Resultaat tekenreeks: " + result);
	}

}
