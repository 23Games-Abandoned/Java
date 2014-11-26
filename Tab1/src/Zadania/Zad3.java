package Zadania;

public class Zad3 {
	
	public static int i,sumad,sumau;

	public static void main(String[] args) {
		int[] tab = new int[10];
		for (int i=0; i < tab.length; i++){
			tab[i] = (int)(Math.random()*201)-100;
		}
		for (int i=0; i < tab.length; i++)
			System.out.printf ("%4d",tab[i]);
		
		for (int i=0; i < tab.length; i++){
			if (tab[i] > 0)
				sumad += tab[i];
			else
				sumau += tab[i];
		}
		
		System.out.println ("\nSuma dodatnich: "+sumad);
		System.out.println ("\nSuma ujemnych: "+sumau);
	}

}
