package test;

import java.util.*;

import metier.Console;
import metier.Jeu;
import model.Boutique;
import model.Client;

public class Test {

	public static void main(String[] args) {
		Console wii = new Console("Wii");
		Console ds = new Console("DS");
		List<Console> listConsole = new ArrayList();
		listConsole.add(ds);
		listConsole.add(wii);
		
		Jeu wiisport = new Jeu("Wiisport", listConsole);
		Jeu jeuwii2 = new Jeu("Jeu Wii 2", listConsole);
		Jeu jeuwii3 = new Jeu("Jeu Wii 3", listConsole);
		Jeu pokemon = new Jeu("Pokemon", listConsole);
		
		Jeu jeuds2 = new Jeu("jeu DS 2", listConsole);
		List<Jeu> listeJeu = new ArrayList();
		listeJeu.add(wiisport);
		listeJeu.add(pokemon);
		listeJeu.add(jeuwii2);
        
		Boutique b1 = new Boutique("Micromania","Nantes",listeJeu);
				
		Client client1 = new Client("Dupont", "Paul", listeJeu);
	}

}
