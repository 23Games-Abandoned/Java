package Podstawy;
import java.util.Scanner;

public class Funkcje2 {
	
	public static int i;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbe:");
		i=odczyt.nextInt();
		System.out.println("Dzielniki liczby: "+i);
		dzielniki(i);		
	}

	private static void dzielniki(int i2) {
		for (int a=i2;a>0;a--){
			if (i2%a==0){
				System.out.println(a);
			}
		}
		
	}
}
