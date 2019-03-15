package h9_opdr7;

//DIENT VOOR SYNCRHONISATIEAPP_OBJECTLOCKING
public class Counter {
	private int count = 0;
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}

}
