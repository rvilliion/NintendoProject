package test;

import java.util.*;

import metier.Console;
import metier.Jeu;
import model.Boutique;
import model.Client;

public class Test {

	public static void main(String[] args) {
		Console wii = new Salon("Wii");
		Console ds = new Portable("DS");
		List<Console> listConsole = new ArrayList();
		listConsole.add(ds);
		listConsole.add(wii);
		
		List<Console> listeConsole = new ArrayList();
		listeConsole.add(wii);
		listeConsole.add(ds);
		
		Jeu wiisport = new Jeu("Wiisport", listeConsole);
		Jeu jeuwii2 = new Jeu("Jeu Wii 2", listeConsole);
		Jeu jeuwii3 = new Jeu("Jeu Wii 3", listeConsole);
		Jeu pokemon = new Jeu("Pokemon", listeConsole);
		Jeu jeuds2 = new Jeu("jeu DS 2", listeConsole);
				
		Client client1 = new Client("Dupont", "Paul", listeJeu);
	}

}
