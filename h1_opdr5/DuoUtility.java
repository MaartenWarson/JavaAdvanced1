package h1_opdr5;

public interface DuoUtility {
	public static void printUpper(Duo<String> d) {
		String d1 = d.getFirst();
		String d2 = d.getSecond();
		
		System.out.println(d1.toUpperCase() + " " + d2.toUpperCase());
	}
	
	public static void printDuo(Duo<?> d) {
		System.out.println(d.getFirst() + " " + d.getSecond());
	}
	
	public static void printSum(Duo<? extends Number> d) {
		Number d1 = d.getFirst();
		Number d2 = d.getSecond();
		
		System.out.println(d1.doubleValue() + d2.doubleValue());
	}
}
