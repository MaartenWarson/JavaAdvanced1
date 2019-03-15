package h9_opdr1;

//SUBKLASSE MAKEN VAN THREAD ZODAT METHODE RUN() GEIMPLEMENTEERD KAN WORDEN.
//WAT IN DIE METHODE STAAT WORDT UITGEVOERD ALS DE THREAD ACTIEF IS.
public class PrintThread extends Thread {
	private char c;
	private int count;
	
	public PrintThread(char c, int count) {
		this.c = c;
		this.count = count;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
	}
}
