import java.util.Scanner;

public class Zad4 {
	
	public static Scanner odczyt;
	public static String slowo;	
	public static char zamiana[];
	public static int x=0;

	public static void main(String[] args) {
		System.out.println("Podaj s³owo");
		odczyt = new Scanner(System.in);
		slowo = odczyt.nextLine();
		char tab[]	=	slowo.toCharArray();
		char zamiana[]	=	slowo.toCharArray();
		for (int i=tab.length-1; i>=0;i--){
			if (tab[i]==' '){
				for (int j=i;j<tab.length;j++){
					tab[i+j]=zamiana[x];
					x++;
				}		
			}
		}
		System.out.println();
		for (int i=0; i<zamiana.length;i++){
			System.out.print(tab[i]);
		}
	}

}