package dao;

import java.util.List;

import Entites.Pays;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PaysDao implements GenericDao<Pays> {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("database_imdb");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();
	
	
	@Override
	public void insert(Pays pays) {

	}

	@Override
	public void delete(Pays entity) {

	}
	
	public List<Pays> findAll() {

		return em.createQuery("SELECT p FROM Pays p", Pays.class).getResultList();
		
	}
}
