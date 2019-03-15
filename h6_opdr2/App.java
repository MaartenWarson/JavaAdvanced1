package h6_opdr2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) {
		Path path = Paths.get("File.txt");
		
		//TEKST SCHRIJVEN (autoclose)
		try(FileWriter file = new FileWriter(path.toFile())) {
			file.write("Dit is een test. \n");
			file.write("Hopelijk werkt het!");
		} catch (IOException ex) {
			System.out.println("Foutje!");
			System.out.println(ex.getMessage());
		}
		
		//TEKST LEZEN
		try {
			Files.lines(path).forEach(System.out::println);
		} catch(IOException ex) {
			System.out.println("BEEP BEEP BEEP - ERROR");
		}
		

	}

}
