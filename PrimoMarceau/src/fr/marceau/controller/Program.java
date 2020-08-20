package fr.marceau.controller;

public class Program {
	
	public static void main(String[] args) {
		
		// déclaration de variable
		//affectation de valeur
		// affichage
		// concaténation
		// structrure alternative (conditions)
		// structure itérative (boucles)
		// tableau
		// function
		// procedure
		// ... => POO
		
		String nom;
		String prenom = "Marceau";
		int age = 18;
		
		nom = "LENOIR";
		
		String nomPrenom = nom + " " + prenom;
		
		//syso (ctrl + espace)
		System.out.println("Bonjour " + nomPrenom + "\n Age : " + age + "ans");
		
		if(age < 18) {
			System.out.println("mineur");
		}
		else if(age < 21) {
			System.out.println("majeur mais pas au USA");
		}
		else {
			System.out.println("majeur dans le monde");
		}
		
		
	}

}
