package test;

import java.util.ArrayList;
import java.util.List;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Console wii = new Console("Wii");
		Console ds = new Console("DS");
		
		List<Console> listeConsole = new ArrayList();
		listeConsole.add(wii);
		listeConsole.add(ds);
		
		Jeu wiisport = new Jeu("Wiisport", listeConsole);
		Jeu jeuwii2 = new Jeu("Jeu Wii 2", listeConsole);
		Jeu jeuwii3 = new Jeu("Jeu Wii 3", listeConsole);
		Jeu pokemon = new Jeu("Pokemon", listeConsole);
		Jeu jeuds2 = new Jeu("jeu DS 2", listeConsole);
				

	}

}
