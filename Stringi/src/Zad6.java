import java.util.Scanner;

public class Zad6 {
	
	public static String a;
	public static Scanner odczyt;
	
	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj s³owo:");
		a = odczyt.nextLine();
		for(char i='a';i<='z';i++){
			if(string_c(a, i)>0){
			System.out.println("Litera "+i+" wystepuje : "+string_c(a, i)+" razy");
			}
		}
		for(char i='A';i<='Z';i++){
			if(string_c(a, i)>0){
			System.out.println("Litera "+i+" wystepuje : "+string_c(a, i)+" razy");
			}
		}
	}
	
	public static int string_c(String str,char char_){
		int l=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==char_){
				l++;
			}
		}
		return l;
	}
}