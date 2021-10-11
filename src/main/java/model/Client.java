package model;

import java.util.ArrayList;
import java.util.List;

import metier.Jeu;

public class Client {
	
	private String nom;
	private String prenom;
	private List<Jeu> jeux =new ArrayList();
	
	
	public Client(String nom, String prenom, List<Jeu> jeux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.jeux = jeux;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public List<Jeu> getJeux() {
		return jeux;
	}


	public void setJeux(List<Jeu> jeux) {
		this.jeux = jeux;
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
}
