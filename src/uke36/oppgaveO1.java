package uke36;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class oppgaveO1 {

	public static void main(String[] args) {
		
		// skriver inn ifo
		Scanner bruttoTxt = new Scanner(System.in);
		String bruttoX;
		double prosent = 0;
		double etterSkatt = 0;
	    
	    System.out.println("Skriv inn lønn pr år: "); 
	    bruttoX = bruttoTxt.nextLine();
	    
	    int brutto = parseInt(bruttoX);
	    
	    // skriver ut info
	    
	    if(brutto<=146100) {
	    	System.out.println("Du trenger ikke skatte. ");
	    }
	    else if (146101<=brutto && brutto<=230950) {
	    	prosent = 0.0093;
	    	etterSkatt = (brutto * (1-prosent));
	    	System.out.println("Du må skatte 0,93% og sitter igjen med " + etterSkatt + "kr.");
	    }
	    else if (230951<=brutto && brutto<=580650) {
	    	prosent = 0.0241;
	    	etterSkatt = (brutto * (1-prosent));
	    	System.out.println("Du må skatte 2,41% og sitter igjen med " + etterSkatt + "kr.");
	    }
	    else if (580651<=brutto && brutto<=934050) {
	    	prosent = 0.1152;
	    	etterSkatt = (brutto * (1-prosent));
	    	System.out.println("Du må skatte 11,52% og sitter igjen med " + etterSkatt + "kr.");
	    }
	    else if (934051<=brutto) {
	    	prosent = 0.1452;
	    	etterSkatt = (brutto * (1-prosent));
	    	System.out.println("Du må skatte 14,52% og sitter igjen med " + etterSkatt + "kr.");
	    }
	    else {
	    	System.out.println("Prøv på nytt.");
	    }
	    
	    
	}

}
