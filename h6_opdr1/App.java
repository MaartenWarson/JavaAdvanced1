package h6_opdr1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		try {
			// PAD AANMAKEN VOOR NIEUW BESTAND IN NIEUWE MAP
			Path path = Paths.get(
					"C:\\Users\\Maarten\\PXL\\2TIW\\Java Advanced 1\\Oefeningen\\0 Oef_InDeLes\\Boek_Opdrachten\\src\\h6_opdr1\\Opdracht1.txt");

			// BESTAND AANMAKEN
			Files.createDirectories(path.getParent());
			if (Files.notExists(path)) {
				Files.createFile(path);
				System.out.println("Pad is aangemaakt.");
			} else {
				System.out.println("File already exists");
			}

			// TEKST SCHRIJVEN NAAR BESTAND
			List<String> lines = new ArrayList<>();
			lines.add("Hello");
			lines.add("World");
			Files.write(path, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);

			// KENMERKEN VAN BESTAND OPVRAGEN
			DosFileAttributes attrs = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println(attrs.size());
			System.out.println(attrs.creationTime());
			System.out.println(attrs.lastAccessTime());
			System.out.println(attrs.lastModifiedTime());
			System.out.println(attrs.isArchive());
			System.out.println(attrs.isHidden());
			System.out.println(attrs.isReadOnly());

			// TEKSTREGELS LEZEN VAN BESTAND
			Files.lines(path).forEach(System.out::println);
			
			// EIGENAAR VAN BESTAND
			System.out.println("Eigenaar: " + Files.getOwner(path));
			
			//HERNOEM BESTAND
			Path newName = Paths.get(path.getParent() + "\\Test.txt");
			Files.move(path, newName, StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
