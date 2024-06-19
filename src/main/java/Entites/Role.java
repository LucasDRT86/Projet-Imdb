package Entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="PERSONNAGE", length = 50, nullable = false)
	String personnage;

	@ManyToMany
	@JoinTable(name="genre_film",
	joinColumns= @JoinColumn(name="id_role", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id")
	 )
	private List<Film> film = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="role_acteur",
	joinColumns= @JoinColumn(name="id_role", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_acteur", referencedColumnName=
	"id")
	 )
	private List<Acteur> acteur = new ArrayList<>();
	
	public Role() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the personnage
	 */
	public String getPersonnage() {
		return personnage;
	}

	/**
	 * @param personnage the personnage to set
	 */
	public void setPersonnage(String personnage) {
		this.personnage = personnage;
	}

	/**
	 * @return the film
	 */
	public List<Film> getFilm() {
		return film;
	}

	/**
	 * @param film the film to set
	 */
	public void setFilm(List<Film> film) {
		this.film = film;
	}

	/**
	 * @return the acteur
	 */
	public List<Acteur> getActeur() {
		return acteur;
	}

	/**
	 * @param acteur the acteur to set
	 */
	public void setActeur(List<Acteur> acteur) {
		this.acteur = acteur;
	}


	
	
}
