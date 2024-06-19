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
import jakarta.persistence.OneToOne;

@Entity
public class Realisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="URL", length = 50, nullable = false)
	String url;

	@OneToOne
    @JoinColumn(name = "personne_id", referencedColumnName = "id")
	private Personne personne;
	
	@ManyToMany
	@JoinTable(name="realisateur_film",
	joinColumns= @JoinColumn(name="id_realisateur", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id")
	 )
	private List<Film> film = new ArrayList<>();
	
	public Realisateur() {
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the personne
	 */
	public Personne getPersonne() {
		return personne;
	}

	/**
	 * @param personne the personne to set
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
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


	
	
}
