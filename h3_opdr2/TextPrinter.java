package h3_opdr2;

public class TextPrinter {
	private String sentence;
	
	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public TextPrinter(String sentence) {
		this.sentence = sentence;
	}

	public void printProcessedWords(WordProcessor processor) {
		for (String w : sentence.split(" ")) {
			System.out.println(processor.process(w));
		}
	}
	
	public void printNumberValues(NumberParser parser) {
		for(String w : sentence.split(" ")) {
			System.out.println(parser.parse(w));
		}
	}
	
	public void printSum(NumberParser parser) {
		double result = 0;
		for(String w : sentence.split(" ")) {
			result += parser.parse(w);
		}
		System.out.println(result);
	}
}
