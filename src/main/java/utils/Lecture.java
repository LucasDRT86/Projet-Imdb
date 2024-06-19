package utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lecture {
	
	public static void main(String[] args) {

		Path path = Paths.get("C:\\Users\\lucas\\OneDrive\\Documents\\Cours\\CDA\\JAVA\\TP\\JAVAProjet\\internet_Movie_Database");
		Path path1 = Paths.get("src/main/resources/acteurs.csv");
		Path path2 = Paths.get("C:\\");
		
		boolean exists = Files.exists(path);
		boolean exists1 = Files.exists(path1);
		boolean exists2 = Files.exists(path2);
		
		System.out.println(exists + " " +exists1 + " " + exists2);
		
		if(exists) {
			System.out.println("yes");
		}
		System.out.println("Répertoire de travail courant : " + System.getProperty("user.dir"));
		//System.out.println(path.getRoot() + " " + path.getParent() + " " + path.getFileName());
	}
}
