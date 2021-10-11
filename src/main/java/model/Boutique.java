package model;

import java.util.List;

import metier.Jeu;

public class Boutique {

	private String nom;
	private String adresse;
	private List<Jeu> Jeux;
	
	
	public Boutique() {
		
	}
	
	public Boutique(String nom, String adresse, List<Jeu> Jeux) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.Jeux = Jeux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Jeu> getListeJeux() {
		return Jeux;
	}

	public void setListeJeux(List<Jeu> Jeux) {
		this.Jeux = Jeux;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Adresse=" + adresse + "]";
	}

	
	
	
	
}
