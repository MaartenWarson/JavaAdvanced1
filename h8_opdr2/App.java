package h8_opdr2;

import java.io.Console;

public class App {
	//WERKT NIET OMDAT HET NORMAAL IN DE CONSOLETOEPASSING GETEST MOET WORDEN
	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			return;
		}
		
		console.printf("Geef een getal in: ");
		int getal = Integer.parseInt(console.readLine());
		
		console.printf("Uitkomst: %d", getal*getal);
	
	}

}
