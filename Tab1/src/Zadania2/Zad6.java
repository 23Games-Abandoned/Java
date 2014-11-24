package Zadania2;

public class Zad6 {
	
	public static int z,h,k=0;

	public static void main(String[] args) {
		
		int[][] tab = new int[5][5];
		
		System.out.println("Podpunkt A");
		
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++){
				tab[k][k] = 1;
			}
			k++;
		}
		
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++)
				System.out.printf ("%3d",tab[i][j]);
			System.out.println();
		}

		System.out.println();
		System.out.println("Podpunkt B");
		
		k=0;
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++){
				tab[k][k] = 1;
			}
			k++;
		}
		
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++)
				System.out.printf ("%3d",tab[i][j]);
			System.out.println();
		}
	}
}