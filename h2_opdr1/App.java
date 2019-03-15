package h2_opdr1;

public class App {

	public static void main(String[] args) {
		Musician musician = new Musician();
		musician.play();
		
		Musician.Instrument instrument = musician.new Instrument();
		instrument.makeSound();
	}

}
