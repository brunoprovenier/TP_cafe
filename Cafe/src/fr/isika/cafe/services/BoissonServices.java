package fr.isika.cafe.services;

import java.util.List;

import fr.isika.cafe.dao.IBoissonDao;
import fr.isika.cafe.domaine.Boisson;
import fr.isika.cafe.domaine.Ingredient;

//Classe de traitement m�tier

public class BoissonServices {
	
	private IBoissonDao iBoissonDao;
		
	public BoissonServices(IBoissonDao iBoissonDao) {
		super();
		this.iBoissonDao = iBoissonDao;
	}


	//Fonction permettant d'appeler la m�thode choisirBoisson de la Dao
	public Boisson choisirBoisson(String nom, String temperature, List<Ingredient> ingredients, double prix ) {
		return iBoissonDao.choisirBoisson(nom, temperature, ingredients, prix);
	}
	
	
	//Fonction permettant d'appeler la m�thode AjouterIngr�dient de la Dao
	public void AjouterIngredient(Boisson boisson, Ingredient ingredient) {
		iBoissonDao.AjouterIngredient(boisson, ingredient);
	}
}
