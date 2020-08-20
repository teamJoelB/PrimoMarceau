package fr.marceau.controller;

import java.util.Scanner;


public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// boucle while
		
		
		System.out.println("Veuillez devinez ma color pref...");
		
		
		String colorInput = sc.nextLine();

		while (!colorInput.equals("SteelBlue") ) {
			
			System.out.println("try again");
			
			colorInput = sc.nextLine();
		}
		
		sc.close();
		System.out.println("bravoooo !!! ");

	}

}
