package h1_opdr4;

public class ComparableDuoApp {

	public static void main(String[] args) {
		ComparableDuo<String> sduo = new ComparableDuo<>("Hello", "Mars");
		ComparableDuo<Integer> iduo = new ComparableDuo<>(10, 20);
		
		String shoogste = sduo.getHighest();
		String slaagste = sduo.getLowest();
		Integer ihoogste = iduo.getHighest();
		Integer ilaagste = iduo.getLowest();
		
		System.out.println(shoogste);
		System.out.println(slaagste);
		System.out.println(ihoogste);
		System.out.println(ilaagste);
	}

}
