package fr.isika.cafe.launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.isika.cafe.dao.BoissonDao;
import fr.isika.cafe.domaine.Boisson;
import fr.isika.cafe.domaine.Ingredient;
import fr.isika.cafe.services.BoissonServices;

public class launcher {

	public static void main(String[] args) {
		
		BoissonDao boissonDao = new BoissonDao();
		BoissonServices boissonServices = new BoissonServices(boissonDao);
		
		//Création des ingrédients disponible dans la machine
		Ingredient sucre = new Ingredient(1, "sucre", 100);
		Ingredient lait = new Ingredient(2, "lait", 20);
		
/*		//Création de la liste des ingrédients de la boisson à créer
		List<Ingredient> ingredients = new ArrayList();
		ingredients.add(sucre);
		ingredients.add(lait);		*/
		
		//Affichage du message de choix de la boisson
		System.out.println("Choisissez votre boisson :\n1-café\n2-chocolat");
		
		//L'utilisateur saisit son choix de boisson 
		
		Scanner scanner = new Scanner(System.in);
		String choix = scanner.nextLine();
		
		//Si le choix est 1 alors il veut du café
		//Si le choix est 2 alors il veut du chocolat
		
		switch(choix) {
		
		case "1" :
			//Création d'une boisson café
			Boisson cafe = new Boisson("café");
			System.out.println("Vous avez choisit un café");
			
			//Proposition des ingrédients (1 pour sucre et 2 pour lait)
			System.out.println("Choisissez un ingrédient :\n1-sucre\n2-lait");
			choix = scanner.nextLine();
			if (choix.equals("1")) {
				boissonServices.AjouterIngredient(cafe, sucre);
			}
			if (choix.equals("2")) {
				boissonServices.AjouterIngredient(cafe, lait);
			}
			System.out.println("récupérer votre " + cafe.toString());
			break;
		case "2" :
			//Création d'une boisson chocolat
			Boisson chocolat = new Boisson("chocolat");
			System.out.println("Vous avez choisit un chocolat");
			System.out.println("récupérer votre" + chocolat.toString());
			break;
		}
		
		
		
	}

}
