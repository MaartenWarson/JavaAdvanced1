package h3_opdr1;

public class App {

	public static void main(String[] args) {
		String sentence = "Hello this is an example of a sentence containing words";
		TextPrinter tp = new TextPrinter(sentence);

		System.out.println("*** WORDS CONTAINING 'E' ***");
		tp.printFilteredWords(s -> s.contains("e"));
		System.out.println();

		System.out.println("*** LONG WORDS ***");
		tp.printFilteredWords(s -> s.length() > 4);
		System.out.println();

		System.out.println("*** WORDS STARTING WITH 'A' ***");
		tp.printFilteredWords(s -> s.startsWith("a"));
		System.out.println();

		System.out.println("*** WORDS SECOND LETTER 'E' ***");
		tp.printFilteredWords(s -> {
			boolean valid = false;
			if (s.length() > 1) {
				if (s.charAt(1) == 'e') {
					valid = true;
				}
			}

			return valid;
		});
		System.out.println();

		System.out.println("*** WORDS CONTAINING 2 TIMES 'E' ***");
		tp.printFilteredWords(s -> {
			int count = 0;
			boolean isValid = false;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'e') {
					count++;
				}
			}

			if (count == 2) {
				isValid = true;
			}

			return isValid;
		});
	}
}
