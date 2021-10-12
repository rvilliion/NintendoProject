package model;

import java.time.LocalDate;
import java.util.List;

import metier.Jeu;
import metier.Console;
import model.Adresse;
import model.Boutique;
import model.Client;

public class Achat {
	
	private Jeu jeu;
	private LocalDate date;
	private double prix;
	private Boutique boutique;
	
	
	public Achat(Jeu jeu, LocalDate date, double prix, Boutique boutique) {
		super();
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
		this.boutique = boutique;
	}

	public Jeu getJeu() {
		return jeu;
	}


	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public Boutique getBoutique() {
		return boutique;
	}


	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}


	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + ", boutique=" + boutique + "]";
	}
	
	
}
