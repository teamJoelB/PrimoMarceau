package fr.marceau.controller;

import javax.swing.JOptionPane;

public class Program4 {

	public static void main(String[] args) {
		

		// boucle while

		String colorInput = JOptionPane.showInputDialog("Veuillez devinez ma color pref...");

		while (!colorInput.equals("SteelBlue")) {

			colorInput = JOptionPane.showInputDialog("try again...");
		}

		JOptionPane.showMessageDialog(null, "Bravaooooo");

	}
}
