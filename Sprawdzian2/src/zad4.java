
public class zad4 {
	
	public static int x=0;

	public static void main(String[] args) {
		int[][] tab = new int[5][5];
		for (int i=0;i<=tab.length-1;i++){
			for (int j=0;j<=tab[i].length-1;j++){
				tab[i][j]=(int) (Math.random()*87-47);
			}
		}

		System.out.println("Tablica nie posortowana");
		for (int i=0;i<=tab.length-1;i++){
			for (int j=0;j<=tab[i].length-1;j++){
				System.out.printf ("%4d",tab[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		for (int i=1;i<=4;i++){
			x+=tab[0][i];
		}
		for (int i=2;i<=4;i++){
			x+=tab[1][i];
		}
		for (int i=3;i<=4;i++){
			x+=tab[2][i];
		}
			x+=tab[3][4];
		System.out.println("Wynik:"+x);
	}
}
