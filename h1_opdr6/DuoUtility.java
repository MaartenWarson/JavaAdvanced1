package h1_opdr6;

/*UTILITY-INTERFACE MAAKT GEBRUIK VAN STATISCHE METHODEN.
 * HIER WORDT GEZEGD DAT ER EEN DUO VAN STRING MOET MEEGEGEVEN
 * WORDEN AAN DE METHODE.*/
public interface DuoUtility {
	public static void printUpper(Duo<String> d) {
		System.out.println(d.getFirst().toUpperCase() + "," + d.getSecond().toUpperCase());
	}
	
	/*Hier wordt aangegeven dat het Duo van eender welk type kan zijn*/
	public static void printDuo(Duo<?> d) {
		System.out.println(d.getFirst() + "," + d.getSecond());
	}
	
	/*We zeggen hier dat het duo van eender welk type mag zijn, MAAR het 
	 * moet een subklasse van NUMBER zijn => BOUNDED WILDCARD (begrensde wildward)*/
	public static void printSum(Duo<? extends Number> d) {
		Number n1 = d.getFirst();
		Number n2 = d.getSecond();
		System.out.println(n1.doubleValue() + n2.doubleValue());
	}
	
	/*Hier mag het type van duo enkel van klasse NUMBER zijn of een superklasse ervan.*/
	public static void printSumSuper(Duo<? super Number> d) {
		//CODE
	}
	
	/*Elementen van verschillende duo's van plaats wisselen => ze moeten beide van hetzelfde type zijn.*/
	public static <T> void swapFirst(Duo<T> d1, Duo<T> d2) {
		T temp = d1.getFirst();
		d1.setFirst(d2.getFirst());
		d2.setFirst(temp);
	}
	
	/*Hier geen <T> meegeven voor VOID omdat het bv. een int en een double kan zijn.*/
	public static void printSum2(Duo<? extends Number> d1, Duo<? extends Number> d2) {
		Number n1 = d1.getFirst();
		Number n2 = d1.getSecond();
		Number n3 = d2.getFirst();
		Number n4 = d2.getSecond();
		
		System.out.println(n1.doubleValue() + n2.doubleValue() + n3.doubleValue() + n4.doubleValue());
	}
	
	/*Hier eis je dat type T wél voor beide duo's hetzelfde is.*/
	public static <T extends Number> void printSumSame(Duo<T> d1, Duo<T> d2) {
		T n1 = d1.getFirst();
		T n2 = d1.getSecond();
		T n3 = d2.getFirst();
		T n4 = d2.getSecond();
		
		System.out.println(n1.doubleValue() + n2.doubleValue() + n3.doubleValue() + n4.doubleValue());
	}
	
	/*Meerdere type-parameters.*/
	public static <T1 extends Number, T2 extends Number> void printSumMixed(Duo<T1> d1, Duo<T1> d2, Duo<T2> d3, Duo<T2> d4) {
		Number n1 = d1.getFirst();
		Number n2 = d1.getSecond();
		Number n3 = d2.getFirst();
		Number n4 = d2.getSecond();
		Number n5 = d3.getFirst();
		Number n6 = d3.getSecond();
		Number n7 = d4.getFirst();
		Number n8 = d4.getSecond();
		
		System.out.println(n1.doubleValue() + n2.doubleValue() + n3.doubleValue() + n4.doubleValue() + n5.doubleValue() + n6.doubleValue() + n7.doubleValue() + n8.doubleValue());
	}
}
