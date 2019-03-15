package h3_opdr3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		String sentence = "Hello this is an example of a sentence containing words";
		TextPrinter tp = new TextPrinter(sentence);

		Consumer<String> printer = System.out::println;
		tp.printProcessedWords(s -> String.format("<<%s>>", printer));
		System.out.println();
		
		//SAMENGESTELDE PREDICATE
		Predicate<String> condition1 = s -> s.contains("e");
		Predicate<String> condition2 = s -> s.contains("a");
		Predicate<String> condition3 = condition1.or(condition2);
		tp.printFilteredWords(condition3);
		System.out.println();
		
		//SAMENGESTELDE FUNCTION
		Function<String, String> proc1 = String::toUpperCase;
		Function<String, String> proc2 = s -> {
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			return sb.toString();
		};
		Function<String, String> proc3 = proc2.andThen(proc1);
		tp.printProcessedWords(proc3);
	}

}
