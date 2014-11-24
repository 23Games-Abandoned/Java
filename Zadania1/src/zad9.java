import java.util.Scanner;

public class zad9 {

	private static Scanner odczyt;
	public static int a,i=0,d=2;
	
	public static void main(String[] args) {
		System.out.println ("Podaj liczbe ca³kowit¹: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println (a+" dzieli siê przez:");
		while (a!=1)
		{
			while (a%d==0)
			{
				a=a/d;
				i++;
			}
			System.out.println (d+"-"+i+" razy");
			d++;
			i=0;
		}
		
	}

}