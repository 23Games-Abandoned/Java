package Podstawy;
import java.util.Scanner;

public class Funkcje4 {
	
	public static int i,x;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbe 1:");
		i=odczyt.nextInt();
		System.out.println("Podaj liczbe 2:");
		x=odczyt.nextInt();
		x=nwd(i, x);
		System.out.println(x);
		x=nww(i, x);
		System.out.println(x);
	}

	public static int nwd(int a, int b) {
		int r;
		while (b>0){
		   r=a % b;
		   a=b;
		   b=r;
		}
		return a;				
	}

	public static int nww(int a, int b) {
		int r;
		r=(a*b)/nwd(a,b);
		return r;				
	}
}
