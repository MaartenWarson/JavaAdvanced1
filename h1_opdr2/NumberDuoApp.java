package h1_opdr2;

public class NumberDuoApp {

	public static void main(String[] args) {
		NumberDuo<Integer> nd1 = new NumberDuo<>(3, 5);
		NumberDuo<Double> nd2 = new NumberDuo<>(3.2, 5.8);
		NumberDuo<Number> nd3 = new NumberDuo<>(3.2, 5);
		
		System.out.println(nd1.getSum());
		System.out.println(nd2.getSum());
		System.out.println(nd3.getSum());
		
		NumberDuo<?> nd4 = new NumberDuo<>(4, 5);
		// Integer i = nd4.getFirst() => NIET MOGELIJK OMDAT TYPE NIET GESPECIFIEERD IS (OVERERVING NIET MOGELIJK)
		Number i1 = nd4.getFirst();
		Number i2 = nd4.getSecond();
		System.out.println(i1);
		System.out.println(i2);
	}

}
