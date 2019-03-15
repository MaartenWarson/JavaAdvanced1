package h9_opdr7;

//DIT DIENT OM HET MISLUKKEN AAN TE TONEN OMDAT NIET GESYNCHRONISEERD IS!!!
public class Synchronisatie_ObjectLockingApp {

	public static void main(String[] args) throws Exception{
		Counter counter = new Counter();
		Thread thread1 = new  Thread(() -> increment(counter, 10000));
		Thread thread2 = new Thread(() -> increment(counter, 10000));
		
		thread1.start();
		thread2.start();
		
		//ER WORDT GEWACHT TOTDAT BEIDE THREADS HIER HUN DING GEDAAN HEBBEN
		thread1.join();
		thread2.join();
		
		System.out.println(counter.getCount());
		//RESULTAAT => GEEFT ALTIJD IETS ANDERS!!!

	}
	
	public static void increment(Counter counter, int number) {
		for (int i = 0; i < number; i++) {
			counter.increment();
		}
	}

}
