package h9_opdr2;

//IMPLEMENTEREN VAN INTERFACE RUNNABLE ZODAT DE RUN()-METHODE GEBRUIKT KAN WORDEN
//IN APP MOET JE OBJECT MAKEN VAN DEZE KLASSE EN MEEGEVEN AAN TRHEAD-CONSTRUCTOR
public class CharacterPrinter implements Runnable {
	private char c;
	private int count;
	
	public CharacterPrinter(char c, int count) {
		this.c = c;
		this.count = count;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println(c);
		}
	}

}
