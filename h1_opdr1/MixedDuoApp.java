package h1_opdr1;

public class MixedDuoApp {

	public static void main(String[] args) {
		MixedDuo<String, Integer> md = new MixedDuo<>("Hello", 5);
		
		String s = md.getFirst();
		Integer i = md.getSecond();
		
		System.out.println(s + " " + i);
	}

}
