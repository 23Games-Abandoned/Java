import java.util.Scanner;

public class Zad3 {
	
	public static Scanner odczyt;
	public static String slowo;	

	public static void main(String[] args) {
		System.out.println("Podaj s³owo");
		odczyt = new Scanner(System.in);
		slowo = odczyt.nextLine();
		char tab[]	=	slowo.toCharArray();
		tab[0]='X';
		for (int i=0; i<tab.length-1;i++){
			if (tab[i]==' '){
				tab[i+1]='X';
			}
		}
		System.out.println();
		for (int i=0; i<tab.length;i++){
			System.out.print(tab[i]);
		}
	}

}

