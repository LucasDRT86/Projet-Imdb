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
import jakarta.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="NOM", length = 50, nullable = false)
	String nom;

	@ManyToMany
	@JoinTable(name="genre_film",
	joinColumns= @JoinColumn(name="id_genre", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="id_film", referencedColumnName=
	"id")
	 )
	private List<Film> film = new ArrayList<>();
	
	public Genre() {
	}

	public Genre(String nom) {
		this.nom = nom;
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

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return nom.equals(genre.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
	
	
}
