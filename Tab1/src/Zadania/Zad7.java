package Zadania;

public class Zad7 {

	public static int sumap=0,suma3=0;

	public static void main(String[] args) {
		int[][] tab = new int[5][5];
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length;j++){
				tab[i][j] = 1+(int)(Math.random()*50);
			}
		}
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++)
				System.out.printf ("%3d",tab[i][j]);
			System.out.println ();
			
		}
		
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++){
				if (tab[i][j]%2==0){
					sumap+=tab[i][j];
				}
				if (tab[i][j]%3==0){
					suma3+=tab[i][j];
				}
			}
		}
		System.out.println ("Suma parzystych: "+sumap);
		System.out.println ("Suma podzielnych przez 3: "+suma3);
	}

}
