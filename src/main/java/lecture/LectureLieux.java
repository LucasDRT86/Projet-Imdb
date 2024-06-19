package lecture;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entites.Acteur;
import Entites.Lieux;
import Entites.Personne;
import utils.ConvertId;

public class LectureLieux {
	
	public List<Lieux> lireFichier() {
		List<Lieux> lieux = new ArrayList<>();
		
		Path path = Paths.get("src/main/ressources/acteurs.csv");
		
		try {
			List<String> lignes =Files.readAllLines(path);
			lignes.remove(0);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return lieux;
	}
	
	public List<Lieux> lireFilms(){
		List<Lieux> lieux = new ArrayList<>();		
		Path path = Paths.get("src/main/ressources/acteurs.csv");
		
		try {
			List<String> lignes =Files.readAllLines(path);
			lignes.remove(0);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lieux;
	}
	
	public List<String> lireActeurs(){
		List<String> s = new ArrayList<>();
		Path path = Paths.get("src/main/ressources/acteurs.csv");
		
		try {
			List<String> lignes =Files.readAllLines(path);
			lignes.remove(0);
			
			for(String ligne : lignes) {

				
				String[] elt = ligne.split(";");
				String[] eltLieux = elt[2].split(",");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return s;
	}
	
	public List<Lieux> lireRealisateurs(){
		List<Lieux> lieux = new ArrayList<>();
		return lieux;
	}
	
	public int paysIntoId(String pays) {
		
		
		
		return 0;
	}

}
