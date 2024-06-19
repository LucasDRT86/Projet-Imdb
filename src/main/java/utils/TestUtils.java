package utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entites.Pays;
import lecture.LecturePays;

public class TestUtils {

	public static void main(String[] args) {
		Path path1 = Paths.get("src/main/resources/acteurs.csv");
		System.out.println(Files.exists(path1));
		LecturePays lp = new LecturePays();
		List<Pays> pays = new ArrayList<>();
		
		pays = lp.lireFichier();
		
		for(Pays p : pays) {
			System.out.println("test");
		}

	}

}
