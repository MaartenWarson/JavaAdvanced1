package h1_opdr5;

public class DuoUtilityApp {

	public static void main(String[] args) {
		Duo<String> sd = new Duo<>("Hello", "World");
		Duo<Float> fd = new Duo<>(5412F, 4896F);
		Duo<Integer> id = new Duo<>(5, 12);
		
		DuoUtility.printUpper(sd);
		DuoUtility.printDuo(fd);
		DuoUtility.printSum(id);
	}

}
