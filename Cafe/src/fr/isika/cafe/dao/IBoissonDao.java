package fr.isika.cafe.dao;

import java.util.List;

import fr.isika.cafe.domaine.Boisson;
import fr.isika.cafe.domaine.Ingredient;

//Interface pour la Dao Boisson 

public interface IBoissonDao {
	Boisson choisirBoisson(String nom, String temperature, List<Ingredient> ingredients, double prix );
	void AjouterIngredient(Boisson boisson, Ingredient ingredient) ;
	
}
