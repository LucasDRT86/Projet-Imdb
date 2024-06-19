package internet_Movie_Database;

import java.util.Scanner;
import Menu.Menu;

public class ApplicationMenu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		boolean quitter = false;

        while (!quitter) {
            Menu.afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                	Menu.afficherFilmographie();
                    break;
                case 2:
                	Menu.afficherCastingFilm();
                    break;
                case 3:
                	Menu.afficherFilmsEntreAnnees();
                    break;
                case 4:
                	Menu.afficherFilmsCommunsActeurs();
                    break;
                case 5:
                	Menu.afficherActeursCommunsFilms();
                    break;
                case 6:
                	Menu.afficherFilmsAnneesActeur();
                    break;
                case 7:
                    quitter = true;
                    System.out.println("Fin de l'application.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option de 1 à 7.");
            }
        }

        scanner.close();
	}

}
