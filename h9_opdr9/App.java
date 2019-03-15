package h9_opdr9;

import java.util.Timer;

public class App {

	public static void main(String[] args) {
		Klok task = new Klok();
		Timer timer = new Timer(true);
		
		//Laat de taak starten na 0 seconden, en daarna iedere seconde uitvoeren!
		timer.schedule(task, 0, 1 * 1000);
		
		try {
			Thread.sleep(20 * 1000);
		} catch(InterruptedException ie) {
			System.out.println("Foutje: " + ie.getMessage());
		}
	}

}
