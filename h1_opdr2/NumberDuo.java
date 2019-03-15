package h1_opdr2;

/*GENERIEKE KLASSE WAARBIJ E EEN SUBKLASSE VAN NUMBER MOET ZIJN.
*WE KUNNEN DAARDOOR ALLE EIGENSCHAPPEN+METHODES VAN NUMBER GEBRUIKEN*/
public class NumberDuo<E extends Number> {
	private E first;
	private E second;
	
	public NumberDuo(E first, E second) {
		this.first = first;
		this.second = second;
	}

	public E getFirst() {
		return first;
	}

	public void setFirst(E first) {
		this.first = first;
	}

	public E getSecond() {
		return second;
	}

	public void setSecond(E second) {
		this.second = second;
	}
	
	public double getSum() {
		return first.doubleValue() + second.doubleValue();
	}

}
