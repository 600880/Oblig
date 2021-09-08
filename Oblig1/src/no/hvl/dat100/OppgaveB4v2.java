package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveB4v2 {

	public static void main(String[] args) {
		
		//Leser inn bruttoinntekt fra bruker.
		String strInntekt = JOptionPane.showInputDialog("Din bruttoinntekt");
		int inntekt = Integer.parseInt(strInntekt);
		
		//Deklarerer variabler.
		double trinnskatt = 0;
		int grense1 = 184800;
		int grense2 = 260100;
		int grense3 = 651250;
		int grense4 = 1021550;
		double sats1 = 0.017;
		double sats2 = 0.04;
		double sats3 = 0.132;
		double sats4 = 0.162;

		//Beregner trinnskatt.
		if (inntekt < grense1) {
			System.out.println("Din trinnskatt er " + trinnskatt + " kroner.");	
		}
		else if (inntekt < grense2) {
			trinnskatt = (inntekt - grense1)*sats1;
			System.out.println("Din trinnskatt er " + trinnskatt + " kroner.");			
		}
		else if (inntekt < grense3) {
			trinnskatt = (grense2 - grense1)*sats1 + (inntekt - grense2)*sats2;
			System.out.println("Din trinnskatt er " + trinnskatt + " kroner.");
		}
		else if (inntekt < grense4) {
			trinnskatt = (grense2 - grense1)*sats1 + (grense3 - grense2)*sats2 + (inntekt - grense3)*sats3;
			System.out.println("Din trinnskatt er " + trinnskatt + " kroner.");
		}
		else if (inntekt >= grense4) {
			trinnskatt = (grense2 - grense1)*sats1 + (grense3 - grense2)*sats2 + (grense4 - grense3)*sats3 + (inntekt - grense4)*sats4;
			System.out.println("Din trinnskatt er " + trinnskatt + " kroner.");
		}
						
	}

}