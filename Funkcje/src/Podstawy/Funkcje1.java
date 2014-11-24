package Podstawy;
import java.util.Scanner;

public class Funkcje1 {
	
	public static int l1,l2,l3;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbe 1:");
		l1=odczyt.nextInt();
		System.out.println("Podaj liczbe 2:");
		l2=odczyt.nextInt();
		System.out.println("Podaj liczbe 3:");
		l3=odczyt.nextInt();
		int min=minimum(l1,l2,l3);
		int max=maximum(l1,l2,l3);
		System.out.println("Najmniejsza liczba: "+min);
		System.out.println("Najwiêksza liczba: "+max);
	}

	public static int minimum (int a,int b,int c){
		int m;
		if (a<b)
			m=a;
		else
			m=b;
		if (c<m)
			return c;
		else
			return m;
	}

	public static int maximum (int a,int b,int c){
		int m;
		if (a>b)
			m=a;
		else
			m=b;
		if (m>c)
			return m;
		else
			return c;
	}
}
