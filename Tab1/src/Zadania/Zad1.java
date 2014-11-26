package Zadania;

import java.util.Scanner;

public class Zad1 {
	
	private static Scanner odczyt;
	public static int i,suma;

	public static void main(String[] args) {
		int[] tab = new int[5];
		for (int a=0; a < tab.length; a++){
			System.out.println ("Podaj liczbe: ");
			odczyt = new Scanner(System.in);
			tab[a] = odczyt.nextInt();
		}
		for (int i=0; i < tab.length; i++)
			System.out.printf ("%2d",tab[i]);
		
		for (int i=0; i < tab.length; i++)
			suma += tab[i];
		
		System.out.println ("\nSuma: "+suma);
	}

}
