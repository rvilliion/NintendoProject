package model;

import java.util.List;

public class Boutique {

	String nom;
	String Adresse;
	List<Jeux> listeJeux;
	
	
	public Boutique() {
		
	}
	
	public Boutique(String nom, String adresse, List<Jeux> listeJeux) {
		super();
		this.nom = nom;
		Adresse = adresse;
		this.listeJeux = listeJeux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public List<Jeux> getListeJeux() {
		return listeJeux;
	}

	public void setListeJeux(List<Jeux> listeJeux) {
		this.listeJeux = listeJeux;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Adresse=" + Adresse + "]";
	}

	
	
	
	
}
