package h1_opdr4;

/*KLASSE WAARBIJ WE KUNNEN KIEZEN VAN WELK TYPE HET PAAR MOET ZIJN.
 * HET TYPE WORDT VAN PAS CONCREET ALS WE EEN OBJECT VAN GENERALPAIR AANMAKEN.*/
public class GeneralPair<E> implements Pair<E> {
	private E left;
	private E right;
	
	public GeneralPair(E left, E right) {
		this.left = left;
		this.right = right;
	}

	public E getLeft() {
		return left;
	}

	public void setLeft(E left) {
		this.left = left;
	}

	public E getRight() {
		return right;
	}

	public void setRight(E right) {
		this.right = right;
	}
}
