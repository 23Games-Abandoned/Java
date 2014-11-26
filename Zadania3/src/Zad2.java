import java.util.Scanner;

public class Zad2 {

	private static Scanner odczyt;
	public static int d,m;
	
	public static void main(String[] args) {
		System.out.println ("Podaj dzieñ: ");
		odczyt = new Scanner(System.in);
		d = odczyt.nextInt();
		System.out.println ("Podaj miesiac: ");
		odczyt = new Scanner(System.in);
		m = odczyt.nextInt();
		switch (m){
			case 1:{
				System.out.println ("Zima");
				break;
			}
			case 2:{
				System.out.println ("Zima");
				break;
			}
			case 3:{
				if (d>21)
					System.out.println ("Wiosna");
				else
					System.out.println ("Zima");
				break;
			}
			case 4:{
				System.out.println ("Wiosna");
				break;
			}
			case 5:{
				System.out.println ("Wiosna");
				break;
			}
			case 6:{
				if (d>21)
					System.out.println ("Lato");
				else
					System.out.println ("Wiosna");
				break;
			}
			case 7:{
				System.out.println ("Lato");
				break;
			}
			case 8:{
				System.out.println ("Lato");
				break;
			}
			case 9:{
				if (d<22)
					System.out.println ("Lato");
				else
					System.out.println ("Jesieñ");
				break;
			}
			case 10:{
				System.out.println ("Jesieñ");
				break;
			}
			case 11:{
				System.out.println ("Jesieñ");
				break;
			}
			case 12:{
				if (d<22)
					System.out.println ("Jesieñ");
				else
					System.out.println ("Zima");
				break;
			}
		}
			
		}
	}