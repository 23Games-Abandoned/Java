package Zadania2;

public class Zad4 {
	
	public static int z,h;

	public static void main(String[] args) {
		
		int[][] tab = new int[5][5];
		
		for (int i=0; i < tab.length; i++)
			for (int j=0; j < tab[i].length; j++)
				tab[i][j] = (int)(Math.random()*51);

		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++)
				System.out.printf ("%3d",tab[i][j]);
			System.out.println();
		}
		
	    for (int i = 0; i < tab.length; i++){
	    	int k=1;
	    	while(k<tab[i].length-1){
	            for (int j = 0; j < tab[i].length-k; j++)
		            if (tab[i][j]<tab[i][j+1]){	
		            	h=tab[i][j];
		            	tab[i][j]=tab[i][j+1];
		            	tab[i][j+1]=h;
		            }
		            k++;
	            }
            }
            	

		System.out.println();
		
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++)
				System.out.printf ("%3d",tab[i][j]);
			System.out.println();
		}
	}

}
