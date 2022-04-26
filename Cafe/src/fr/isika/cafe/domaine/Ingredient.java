package fr.isika.cafe.domaine;

//Classe des ingrédients pouvant être ajouté à la boisson

public class Ingredient {
	private int id;
	private String nom;
	private double quantite;
	
	
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
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	
	//Constructeur surchargé
	public Ingredient(int id, String nom, double quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "" + nom ;
	}
	
	
	
	
}
