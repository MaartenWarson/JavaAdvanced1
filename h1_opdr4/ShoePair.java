package h1_opdr4;

/*KLASSE WAARBIJ WE ZEGGEN DAT HET EEN PAAR VAN SCHOENEN MOET ZIJN*/
public class ShoePair implements Pair<Shoe>{
	private Shoe leftShoe;
	private Shoe rightShoe;
	
	public ShoePair(Shoe left, Shoe right) {
		leftShoe = left;
		rightShoe = right;
	}
	
	public Shoe getLeft() {
		return leftShoe;
	}
	
	public Shoe getRight() {
		return rightShoe;
	}
	
	public void setLeft(Shoe left) {
		leftShoe = left;
	}
	
	public void setRight(Shoe right) {
		rightShoe = right;
	}

}
