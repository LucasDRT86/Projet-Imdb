package Entites;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="ville", length = 255, nullable = false)
	String ville;
	
	@Column(name="region")
	String region;
	
	@Column(name="date_naissance")
	LocalDate dateNaissance;
	
	@OneToOne(mappedBy ="personne")
	private Acteur acteur;
	
	@OneToOne(mappedBy ="personne")
	private Realisateur realisateur;
	
	@ManyToOne
	@JoinColumn(name="id_lieux")
	private Lieux lieux; 

	public Personne() {
	}

	public Personne(String ville, String region) {
		this.ville = ville;
		this.region = region;
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
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the acteur
	 */
	public Acteur getActeur() {
		return acteur;
	}

	/**
	 * @param acteur the acteur to set
	 */
	public void setActeur(Acteur acteur) {
		this.acteur = acteur;
	}

	/**
	 * @return the realisateur
	 */
	public Realisateur getRealisateur() {
		return realisateur;
	}

	/**
	 * @param realisateur the realisateur to set
	 */
	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}

	/**
	 * @return the lieux
	 */
	public Lieux getLieux() {
		return lieux;
	}

	/**
	 * @param lieux the lieux to set
	 */
	public void setLieux(Lieux lieux) {
		this.lieux = lieux;
	}



	
}
