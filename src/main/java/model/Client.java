package model;

import java.util.ArrayList;
import java.util.List;

import metier.Jeu;

public class Client {
	
	private String nom;
	private String prenom;
	private List<achat> achat;
	
	
	public Client(String nom, String prenom, List<achat> achat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.achat = achat;
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


	public List<achat> getAchat() {
		return achat;
	}


	public void setAchat(List<achat> achat) {
		this.achat = achat;
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}


	

	
	
	
	
}
