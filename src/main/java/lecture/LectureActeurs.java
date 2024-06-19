package lecture;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entites.Acteur;
import Entites.Personne;
import utils.ConvertId;
import utils.ConvertLieux;

public class LectureActeurs {

	public List<Acteur> lireFichier() {
		
		List<Acteur> acteurs = new ArrayList<>();
		
		Path path = Paths.get("src/main/ressources/acteurs.csv");
		
		try {
			List<String> lignes =Files.readAllLines(path);
			lignes.remove(0);
			
			for(String ligne : lignes) {
				Acteur acteur = new Acteur();
				Personne personne = new Personne();
				
				String[] elt = ligne.split(";");
				
				acteur.setId(ConvertId.convert(elt[0]));       //ID
				acteur.setTaille(Double.parseDouble(elt[4]));  //Taille
				acteur.setUrl(elt[5]);                         //Url
			
				
				//acteur.set
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return acteurs;
	}
}
