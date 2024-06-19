package dao;

import java.util.List;

import Entites.Genre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GenreDao implements GenericDao<Genre>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("database_imdb");
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public void insert(Genre genre) {

	}

	@Override
	public void delete(Genre genere) {

	}
	
	public List<Genre> findAll() {

		return em.createQuery("SELECT g FROM Gnere g", Genre.class).getResultList();
		
	}
	
	public void emClose() {
		em.close();
	}
}
