package h1_opdr4;

public interface Pair<E> {
	public E getLeft();
	public E getRight();
	public void setLeft(E left);
	public void setRight(E right);
	
	//DEFAULT hoeft niet geïmplemeneerd te zijn in de implementerende klasse
	public default void swap() {
		E temp = getLeft();
		setLeft(getRight());
		setRight(temp);
	}
}
