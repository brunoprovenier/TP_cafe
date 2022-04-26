package fr.isika.cafe.dao;

import java.util.List;

import fr.isika.cafe.domaine.Boisson;
import fr.isika.cafe.domaine.Ingredient;


//Classe Dao implémentant l'interface IBoissonDao pour modifier les instances Boissons de la BDD

public class BoissonDao implements IBoissonDao{
	public Boisson choisirBoisson(String nom, String temperature, List<Ingredient> ingredients, double prix ) {
		return null;
	}
	
	public void AjouterIngredient(Boisson boisson, Ingredient ingredient) {
		boisson.getIngredients().add(ingredient);
	}

}
