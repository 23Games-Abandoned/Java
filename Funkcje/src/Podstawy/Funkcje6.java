package Podstawy;
import java.util.Scanner;

public class Funkcje6 {
	
	public static int i1,i2,x;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		i1=odczyt.nextInt();
		System.out.println("/");
		i2=odczyt.nextInt();
		nwd(i1,i2);
	}

	public static void nwd(int a, int b) {
		int r,a1=a,b1=b;
		while (b>0){
		   r=a % b;
		   a=b;
		   b=r;
		}
		if (a1%a==0 && b1%a==0 && a1%a!=a1 && b1%a!=b1){
			System.out.print(a1/a+"/"+b1/a);
		} else
			System.out.println("Nie da siê skróciæ!");
	}
}
