package Podstawy;
import java.util.Scanner;

public class Funkcje3 {
	
	public static int i,a;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbe:");
		i=odczyt.nextInt();
		a=znak(i);	
		System.out.println(a);
	}

	private static int znak(int i2) {
		if (i2>0)
			return 1;
		else if (i2==0)
			return 0;
		else
			return -1;		
	}
}
