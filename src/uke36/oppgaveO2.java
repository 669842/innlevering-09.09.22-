package uke36;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class oppgaveO2 {
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			Scanner poengsumTxt = new Scanner(System.in);
			String poengsumX;

			System.out.println("Skriv inn poengsum: ");
			poengsumX = poengsumTxt.nextLine();


			String tekst = "Karakteren er ";

			int poengsum = parseInt(poengsumX);


	    	if(0<=poengsum && poengsum<=39) {
	    		System.out.println(tekst + "F");	    	
	    	}
	    	else if (40<=poengsum && poengsum<=49) {
	    		System.out.println(tekst + "E");
	    	}
	    	else if (50<=poengsum && poengsum<=59) {
	    		System.out.println(tekst + "D");
	    	}
	    	else if (60<=poengsum && poengsum<=79) {
	    		System.out.println(tekst + "C");
	    	}
	    	else if (80<=poengsum && poengsum<=89) {
	    		System.out.println(tekst + "B");
	    	}
	    	else if (90<=poengsum && poengsum<=100) {
	    		System.out.println(tekst + "A");
	    	}
	    	else {
	    		System.out.println("Ugyldig poengsum (Negativ verdi eller over 100)");
	    	}
	    	if (poengsum<0 || poengsum>100) {
	    		i--;
	    	}
	    }
		
	}

}
