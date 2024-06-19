package lecture;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Entites.Pays;

public class LecturePays {

	public List<Pays> lireFichier() {

		List<Pays> pays = new ArrayList<>();

		Path path = Paths.get("src/main/resources/pays.csv");

		try {
			List<String> lignes =Files.readAllLines(path);
			lignes.remove(0);

			for(String lePays : lignes) {
				Pays p = new Pays();

				String[] elt = lePays.split(";");

				p.setNom(elt[0]);
				p.setUrl(elt[1]);
				pays.add(p);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return pays;
	}
}
