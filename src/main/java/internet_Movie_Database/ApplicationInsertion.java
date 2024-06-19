package internet_Movie_Database;

import java.util.ArrayList;
import java.util.List;

import Entites.Genre;
import Entites.Pays;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import lecture.LectureGenre;
import lecture.LecturePays;

public class ApplicationInsertion {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("database_imdb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		
		transaction.begin();
		
		LecturePays lp = new LecturePays();
		List<Pays> pays = new ArrayList<>();
		
		pays = lp.lireFichier();
		
		for(Pays p : pays) {
			em.persist(p);
		}
		
				
		LectureGenre lg = new LectureGenre();
		List<Genre> genres = new ArrayList<>();
		
		genres = lg.lireFichier();
		
		for(Genre g : genres) {
			em.persist(g);
		}
		
		transaction.commit();
		
		em.close();
	}

}
