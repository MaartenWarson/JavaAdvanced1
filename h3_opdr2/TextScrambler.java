package h3_opdr2;

public class TextScrambler {
	public String scramble(String s) {
		s = s.replace('a', '@');
		s = s.replace('e', '€');
		s = s.replace('l', '1');
		s = s.replace('o', '0');
		
		return s;
	}
}
