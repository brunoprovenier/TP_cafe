// Classe Boisson
// détails d'une boisson 


package fr.isika.cafe.domaine;

import java.util.ArrayList;
import java.util.List;

public class Boisson {

	private int id;
	private String nom;
	private String temperature; 
	private List<Ingredient> ingredients;
	private double prix;
	
	//Constructeur  
	public Boisson(String nom) {
		super();
		this.nom = nom;		
		this.ingredients = new ArrayList();
	}
	
	//Constructeur surchargé
	public Boisson(int id, String nom, String temperature, List<Ingredient> ingredients, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.temperature = temperature;
		this.ingredients = ingredients;
		this.prix = prix;
	}

	//Getters et Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String toString() {
		return "" + nom + " avec du " + ingredients.get(0)  ;
	}
	
	
}



enum temperature{
	chaud,
	froid,
}