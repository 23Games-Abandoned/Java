package Zadania2;

public class Zad2 {
	
	public static int z,h;

	public static void main(String[] args) {
		
		int[] tab = new int[20];
		
		for (int i=0; i < tab.length; i++)
			tab[i] = (int)(Math.random()*51);
		
		for (int i=0; i < tab.length; i++)
			System.out.printf ("%3d",tab[i]);
		
		for (int i=0; i < tab.length/2; i++){
				h = tab[i];
				tab[i]=tab[tab.length-1-i];
				tab[tab.length-i-1]=h;
		}
	    
		System.out.println ();		
		for (int i=0; i < tab.length; i++)
			System.out.printf ("%3d",tab[i]);
	}

}
