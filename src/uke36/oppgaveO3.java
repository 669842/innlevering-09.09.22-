package uke36;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class oppgaveO3 {
	
	public static void main(String[] args) {
		
		Scanner nTxt = new Scanner(System.in);
		String nX;

		System.out.println("Skriv inn n verdi for å regne fakultet: ");
		nX = nTxt.nextLine();

		int n = parseInt(nX);
		int x = 1;
		
		String tekst = n + " fakultet er ";
		
		System.out.print(tekst);
		
		for (int i = n; i>=0; i--) {
			x = x*i;
			if(i==1) {
				System.out.print(x);
			}

		}

			
		
		

}}
