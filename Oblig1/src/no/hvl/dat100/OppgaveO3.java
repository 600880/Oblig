package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		// Leser inn tall fra bruker, og kontrollerer at det er st�rre enn 0.
		int tall = 0;
		while (tall < 1) {	
			String strTall = JOptionPane.showInputDialog("Velg heltall n for � beregne n!:");
			tall = Integer.parseInt(strTall);
		}
		
		// Deklarerer n�dvendige variabler.
		int fakultet = tall-1;
		int svar = tall;
		
		// Beregner n-fakultet.
		while (fakultet > 1) {
			svar = svar*fakultet;
			fakultet--;
		}
		
		// Skriver ut svar p� skjerm.
		JOptionPane.showMessageDialog(null, tall + "! = " + svar);

	}

}