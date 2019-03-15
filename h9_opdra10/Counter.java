package h9_opdra10;

import java.util.concurrent.atomic.AtomicInteger;

//Atomic-versies gebruiken => deze kunnen ook maar 1 keer tegelijk geraadpleegd worden
public class Counter {
	private AtomicInteger count = new AtomicInteger(0);
	
	public void increment() {
		count.incrementAndGet();
	}
	
	public void decrement() {
		count.decrementAndGet();
	}
	
	public int getCount() {
		return count.get();
	}

}
