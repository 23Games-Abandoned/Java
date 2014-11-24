
public class zad2 {
	
	public static int x=0,y=0;

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
		
		for (int i=0;i<=tab.length-1;i++){
			for (int j=0;j<=tab[i].length-1;j++){
				if (tab[i][j]%4!=0){
					x+=tab[i][j];
					y++;
				}
			}
		}
		System.out.println("Suma wynosi: "+x+", a iloœæ wynosi: "+y);
	}

}
