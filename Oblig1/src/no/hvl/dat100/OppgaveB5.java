package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveB5 {

	public static void main(String[] args) {
		
		char karakter;
		int poengSum = 0;

		//Kjører løkke for innlesing av poengsum ti ganger.
		//Løkken går bare videre hvis poengsum er innenfor 0-100.
		for (int i = 0; i < 10; i++) {
			boolean godkjent = false;
			while (!godkjent) {
				String strPoengSum = JOptionPane.showInputDialog("Poengsum: ");
				poengSum = Integer.parseInt(strPoengSum);
				if (poengSum >= 0 && poengSum <= 100) {
					godkjent = true;	
				}
				else {
					System.out.println("Ugyldig poengsum.");
				}
			}

			//Skriver ut karakter som samsvarer med innlest poengsum.
			if (poengSum >= 90 ) {
				karakter = 'A';
				System.out.println("Karakter: " + karakter);
			}
			else if (poengSum >= 80 ) {
				karakter = 'B';	
				System.out.println("Karakter: " + karakter);
			}
			else if (poengSum >= 60 ) {
				karakter = 'C';
				System.out.println("Karakter: " + karakter);
			}
			else if (poengSum >= 50 ) {
				karakter = 'D';
				System.out.println("Karakter: " + karakter);
			}
			else if (poengSum >= 40 ) {
				karakter = 'E';
				System.out.println("Karakter: " + karakter);
			}
			else if (poengSum < 40 ) {
				karakter = 'F';
				System.out.println("Karakter: " + karakter);
			}
		}
	}
	
}