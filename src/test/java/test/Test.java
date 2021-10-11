package test;


import metier.*;
import java.util.ArrayList;
import java.util.List;
import model.*;


public class Test {

	public static void main(String[] args) {
		Console wii = new Salon("Wii");
		Console ds = new Portable("DS");
		
		
		List<Console> listeConsole = new ArrayList();
		listeConsole.add(wii);
		listeConsole.add(ds);
		
		Jeu wiisport = new Jeu("Wiisport", listeConsole);
		Jeu jeuwii2 = new Jeu("Jeu Wii 2", listeConsole);
		Jeu jeuwii3 = new Jeu("Jeu Wii 3", listeConsole);
		Jeu pokemon = new Jeu("Pokemon", listeConsole);
		Jeu jeuds2 = new Jeu("jeu DS 2", listeConsole);
		
		
		List<Jeu> listeJeu = new ArrayList();
		listeJeu.add(wiisport);
		listeJeu.add(pokemon);
		listeJeu.add(jeuwii2);
				
		
		Boutique b1 = new Boutique("Micromania","Nantes",listeJeu);
		//Client client1 = new Client("Dupont", "Paul", listeJeu);
	}

}
