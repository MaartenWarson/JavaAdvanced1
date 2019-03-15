package h6_opdr3;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
		
		//LEEST EEN BESTAND EN DRUKT DE INHOUD AF OP HET SCHERM! (karakter per karakter)
		Path padTemp = Paths.get("Test.txt");
		String pad = padTemp.toAbsolutePath().toString();
		
		try (FileReader file = new FileReader(pad)) {
			int character;
			
			while((character = file.read()) != -1) {
				System.out.print((char) character);
			}
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
