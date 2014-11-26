package Zadania2;

public class Zad1 {

	public static void main(String[] args) {
		
		int[] tab = new int[20];
		
		for (int i=0; i < tab.length; i++)
			tab[i] = (int)(Math.random()*101);
		
		for (int i=0; i < tab.length; i++)
			System.out.print (tab[i]+" ");
		
	    for (int i = 0, size = tab.length - 1; i < tab.length - 1; i++, size--)
            for (int j = 0; j < size; j++)
                for (int temp = tab[j]; tab[j] > tab[j + 1]; tab[j] = tab[j + 1], tab[j + 1] = temp) ;
	    
		System.out.println ();		
		for (int i=0; i < tab.length; i++)
			System.out.print (tab[i]+" ");
	}

}
