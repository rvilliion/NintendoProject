package test;

import java.util.ArrayList;
import java.util.List;

import metier.Console;
import metier.Jeu;
import model.Boutique;

public class Test {

	public static void main(String[] args) {
		Console wii = new Console("Wii");
		Console ds = new Console("DS");
		
		Jeu wiisport = new Jeu("Wiisport", wii);
		Jeu jeuwii2 = new Jeu("Jeu Wii 2", wii);
		Jeu jeuwii3 = new Jeu("Jeu Wii 3", wii);
		Jeu pokemon = new Jeu("Pokemon", ds);
		Jeu jeuds2 = new Jeu("jeu DS 2", ds);
		
		List<Jeu> listj1 = new ArrayList();
		listj1.add(pokemon);
		listj1.add(wiisport);
		listj1.add(jeuwii2);
		
		Boutique b1 = new Boutique("Micromania","Nantes",listj1);
		
				

	}

}
