package com.hb.examples;

public class Application {

	public static void main(String[] args) {
		instantiations();
		
		conditions();
		
		int[] tableauEntiers = {1, 2, 3, 4};
		boucleFor(tableauEntiers);
		
		boucleWhile(tableauEntiers);
	}
	
	public static void instantiations() {
		// déclaration et utilisation d'un entier
		int unEntier = 0;
		System.out.println(unEntier);
		unEntier = unEntier + 3;
		System.out.println(unEntier);

		// déclaration et utilisation d'un String
		String text = "";
		text = "coucou";
		System.out.println(text);
		text += " toi !!";
		System.out.println(text);
		
		// déclaration d'un tableau d'entier
		int[] entiers = {1,2,3};
		System.out.println("Valeur de l'index 0 - "+entiers[0]);
		entiers[0] = 55;
		System.out.println("Valeur de l'index 0 - "+entiers[0]);
	}
	
	public static void conditions() {
		// déclaration d'un entier
		int entier = 0;
		// appel d'une fonction
		affichageEntierNul(entier);
		// changement de la valeur de l'entier
		entier = 25;
		// appel d'une fonction
		affichageEntierNul(entier);
	}
	
	public static void affichageEntierNul(int entier) {
		if(entier == 0) {
			System.out.println("Mon entier "+entier+" est nul.");
		} else {
			System.out.println("Mon entier "+entier+" n'est pas nul.");
		}
	}
	
	public static void boucleFor(int[] entiers) {
		// j'itère sur chacune des valeurs
		for(int compteur = 0; compteur < entiers.length; compteur++) {
			System.out.println("index - "+compteur+" / valeur entier - "+entiers[compteur]);
		}
		
		// j'itère sur chacunes des valeurs
		for(int entier : entiers) {
			System.out.println("valeur de l'entier : "+entier);
		}
		
		// je stocke le total des additions de chacune des valeurs
		int somme = 0;
		for(int entier : entiers) {
			somme = somme + entier;
		}
		System.out.println("La somme des entiers vaut : "+somme);
	}
	
	public static void boucleWhile(int[] entiers) {
		int compteur = 0;
		
		while(compteur<entiers.length) {
			System.out.println("index : "+compteur+ " / valeur "+entiers[compteur]);
			compteur++;
		}
	}

}
