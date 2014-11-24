package Zadania2;

public class Zad3 {
	
	public static int z,h;

	public static void main(String[] args) {
		
		int[] tab = new int[20];
		
		for (int i=0; i < tab.length; i++)
			tab[i] = (int)(Math.random()*101);
		
		for (int i=0; i < tab.length; i++)
			System.out.printf ("%4d",tab[i]);
		
		for (int i=0; i < tab.length; i+=2){
				h = tab[i];
				tab[i]=tab[i+1];
				tab[i+1]=h;
		}
	    
		System.out.println ();		
		for (int i=0; i < tab.length; i++)
			System.out.printf ("%4d",tab[i]);
	}

}
