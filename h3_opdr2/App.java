package h3_opdr2;

public class App {

	public static void main(String[] args) {
		String sentence = "Hello this is an example of a sentence containing words";
		TextPrinter tp = new TextPrinter(sentence);

		tp.printProcessedWords(TextUtil::reverse);
		System.out.println();
		
		TextScrambler scrambler = new TextScrambler();
		tp.printProcessedWords(scrambler::scramble);
		System.out.println();
		
		tp.printProcessedWords(String::toLowerCase);
		System.out.println();
	}

}
