package lecture;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entites.Film;
import Entites.Pays;

public class LectureFilms {
	
	public List<Film> lireFichier() {

		List<Film> films = new ArrayList<>();

		Path path = Paths.get("src/main/ressources/film.csv");

		try {
			List<String> lignes =Files.readAllLines(path);
			lignes.remove(0);

			for(String film : lignes) {
				Film f = new Film();

				String[] elt = film.split(";");

				f.setNom(elt[0]);
				f.setAnnee(Integer.parseInt(elt[1]));
				f.setRating(Double.parseDouble(elt[2]));
				f.setUrl(elt[3]);
				


				//acteur.set
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return films;
	}
}
