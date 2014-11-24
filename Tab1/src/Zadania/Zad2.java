package Zadania;

public class Zad2 {
	
	public static int i,sumap,suman;

	public static void main(String[] args) {
		int[] tab = new int[10];
		for (int i=0; i < tab.length; i++){
			tab[i] = (int)(Math.random()*101);
		}
		for (int i=0; i < tab.length; i++)
			System.out.printf ("%4d",tab[i]);
		
		for (int i=0; i < tab.length; i++){
			if (tab[i]%2==0)
				sumap += tab[i];
			else
				suman += tab[i];
		}
		
		System.out.println ("\nSuma parzysta: "+sumap);
		System.out.println ("\nSuma nieparzysta: "+suman);
	}

}
