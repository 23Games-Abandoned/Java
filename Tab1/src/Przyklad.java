
public class Przyklad {

	public static void main(String[] args) {
		int[][] tab = new int[2][3];
		int licznik = 8;
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++)
				tab[i][j] = licznik++;
		}
		
		for (int i=0; i < tab.length; i++){
			for (int j=0; j < tab[i].length; j++)
				System.out.printf ("%3d",tab[i][j]);
		System.out.println();
		}
	}

}
