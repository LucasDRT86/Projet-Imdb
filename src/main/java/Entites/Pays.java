package Entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pays {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="NOM", length = 50, nullable = false)
	String nom;
	
	@Column(name="URL", length = 255, nullable = false)
	String url;
	
	@OneToMany(mappedBy="pays")
	List<Lieux> lieux = new ArrayList<>();
	
	@OneToMany(mappedBy="pays")
	List<Film> films = new ArrayList<>();

	public Pays() {
	}

	public Pays(String nom, String url) {
		this.nom = nom;
		this.url = url;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
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
	 * @return the lieux
	 */
	public List<Lieux> getLieux() {
		return lieux;
	}

	/**
	 * @param lieux the lieux to set
	 */
	public void setLieux(List<Lieux> lieux) {
		this.lieux = lieux;
	}

	/**
	 * @return the films
	 */
	public List<Film> getFilms() {
		return films;
	}

	/**
	 * @param films the films to set
	 */
	public void setFilms(List<Film> films) {
		this.films = films;
	}


	
	
	
}
