package h3_opdr3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {
	private String sentence;
	private Consumer<String> printer;
	
	public TextPrinter(String sentence) {
		this.sentence = sentence;
	}
	
	public TextPrinter(String sentence, Consumer<String> printer) {
		this.sentence = sentence;
		this.printer = printer;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public Consumer<String> getPrinter() {
		return printer;
	}

	public void setPrinter(Consumer<String> printer) {
		this.printer = printer;
	}

	public void printFilteredWords(Predicate<String> filter) {
		for (String w : sentence.split(" ")) {
			if (filter.test(w)) {
				System.out.println(w);
			}
		}
	}
	public void printFilteredWords(Predicate<String> filter, Consumer<String> printer) {
		for (String w : sentence.split(" ")) {
			if (filter.test(w)) {
				printer.accept(w);
			}
		}
	}
	
	public void printProcessedWords(Function<String, String> processor) {
		for (String w : sentence.split(" ")) {
			System.out.println(processor.apply(w));
		}
	}
	
	public void printNumberValues(Function<String, Long> parser) {
		for (String w : sentence.split(" ")) {
			System.out.format("%,d%n", parser.apply(w));
		}
	}
}
