package Podstawy;
import java.util.Scanner;

public class Funkcje10 {
	
	public static int a,b;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczn�:");
		a=odczyt.nextInt();
		System.out.println("Warto�� bezwzgl�dna z liczby "+a+" wynosi: "+bezwzgledna(a));
		bezwzgledna(a);
	}

	public static int bezwzgledna (int a) {
		return b = Math.abs(a);
	}
}