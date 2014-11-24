package Zadania;

public class Zad6 {

	public static int i,l=0,sumat=0,sumak;

	public static void main(String[] args) {
		int[][] tab = new int[5][5];
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length;j++){
				tab[i][j] = (int)(Math.random()*201)-100;
			}
		}
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++)
				System.out.printf ("%4d",tab[i][j]);
			System.out.println ();
			
		}
		
		for (int i=0; i < tab.length; i++){
			sumak=0;
			for (int j=0; j < tab[i].length; j++){
				sumat += tab[i][j];
				sumak += tab[i][j];
			}
			l++;
			System.out.println ("Suma wiersza "+l+" wynosi: "+sumak);
		}
		System.out.println ("Suma tablicy: "+sumat);
	}

}
