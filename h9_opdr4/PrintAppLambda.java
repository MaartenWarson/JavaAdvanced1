package h9_opdr4;

public class PrintAppLambda {

	/*Interface Runnable is een functionele interface met enkel methode run().
	 * Hier geef ik geen paramater aan mee. Deze run()-methode geef ik de implementatie
	 * van print('#', 100). Dit roept de methode op die ik hieronder geschreven heb.
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> print('#', 100));
		Thread thread2 = new Thread(() -> print('*', 100));
		thread2.setDaemon(true); //Als deze thread nog niet klaar is maar de rest wel, zal het programma toch eindigen
		
		System.out.println(thread1.getState());
		System.out.println(thread2.getState());
		thread1.start();
		System.out.println(thread1.getState());
		thread2.start();
		System.out.println(thread2.getState());
		
		//Toont aan dat de main op zicht ook een thread is
		print('@', 100);
		
		//Cooperatieve samenwerking aanzetten (helpt niet veel meer)
		Thread.yield();

	}

	public static void print(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
	}
}