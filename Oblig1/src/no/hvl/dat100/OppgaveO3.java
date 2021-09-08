package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		// Leser inn tall fra bruker, og kontrollerer at det er større enn 0.
		int tall = 0;
		while (tall < 1) {	
			String strTall = JOptionPane.showInputDialog("Velg heltall n for å beregne n!:");
			tall = Integer.parseInt(strTall);
		}
		
		// Deklarerer nødvendige variabler.
		int fakultet = tall-1;
		int svar = tall;
		
		// Beregner n-fakultet.
		while (fakultet > 1) {
			svar = svar*fakultet;
			fakultet--;
		}
		
		// Skriver ut svar på skjerm.
		JOptionPane.showMessageDialog(null, tall + "! = " + svar);

	}

}