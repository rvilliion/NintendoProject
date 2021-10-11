package model;

import java.util.List;

import metier.Jeu;

public class Boutique {

	private String nom;
	private String adresse;
	private List<Jeu> listeJeux;
	
	
	public Boutique() {
		
	}
	
	public Boutique(String nom, String adresse, List<Jeu> listeJeux) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.listeJeux = listeJeux;
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
		return listeJeux;
	}

	public void setListeJeux(List<Jeu> listeJeux) {
		this.listeJeux = listeJeux;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Adresse=" + adresse + "]";
	}

	
	
	
	
}
