package lecture;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entites.Film;
import Entites.Genre;
import Entites.Pays;

public class LectureGenre {
	
	public List<Genre> lireFichier() {

		List<Genre> genres = new ArrayList<>();

		Path path = Paths.get("src/main/resources/films.csv");

		try {
			List<String> lignes =Files.readAllLines(path);
			lignes.remove(0);

			for(String ligne : lignes) {
				List<Genre> gList = new ArrayList<>();
				

				String[] elt = ligne.split(";");
				String[] eltGenre = elt[6].split(",");
				
				for(String genreSplit : eltGenre) {
					Genre g = new Genre();
					g.setNom(genreSplit);
					
					gList.add(g);
				}

				ajouterGenresUnique(genres, gList);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return genres;
	}
	
	/**
	 * @param genres
	 * @param gList
	 */
	public static void ajouterGenresUnique(List<Genre> genres, List<Genre> gList) {
        for (Genre newGenre : gList) {
            boolean exists = false;
            for (Genre existingGenre : genres) {
                if (existingGenre.getNom().equalsIgnoreCase(newGenre.getNom())) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
            	genres.add(newGenre);
            }
        }
    }
}
