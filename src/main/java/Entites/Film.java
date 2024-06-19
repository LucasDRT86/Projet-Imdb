package Entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="NOM", length = 50, nullable = false)
	String nom;
	
	@Column(name="ANNEE", length = 4, nullable = false)
	int annee;
	
	@Column(name="RATING", nullable = false)
	double rating;
	
	@Column(name="LANGUE", length = 25, nullable = false)
	String langue;
	
	@Column(name="RESUME", length = 255, nullable = false)
	String resume;
	
	@Column(name="URL", length = 100, nullable = false)
	String url;
	
	@ManyToMany
	@JoinTable(name="genre_film",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_genre", referencedColumnName=
	"id")
	 )
	private List<Genre> genre = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="realisateur_film",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_realisateur", referencedColumnName=
	"id")
	 )
	private List<Realisateur> realisateur = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="genre_film",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_role", referencedColumnName=
	"id")
	 )
	private List<Role> Role = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="acteur_film",
	joinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_acteur", referencedColumnName=
	"id")
	 )
	private List<Acteur> acteur = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="id_pays")
	private Pays pays; 
	
	public Film() {
	}

	public Film(String nom, int annee, double rating, String langue, String resume) {
		this.nom = nom;
		this.annee = annee;
		this.rating = rating;
		this.langue = langue;
		this.resume = resume;
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
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}

	/**
	 * @param resume the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
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
	 * @return the genre
	 */
	public List<Genre> getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(List<Genre> genre) {
		this.genre = genre;
	}

	/**
	 * @return the realisateur
	 */
	public List<Realisateur> getRealisateur() {
		return realisateur;
	}

	/**
	 * @param realisateur the realisateur to set
	 */
	public void setRealisateur(List<Realisateur> realisateur) {
		this.realisateur = realisateur;
	}

	/**
	 * @return the role
	 */
	public List<Role> getRole() {
		return Role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(List<Role> role) {
		Role = role;
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

	/**
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

}
