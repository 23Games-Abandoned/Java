package stringi;

import functions.str;

public class zad5 {

	public static void main(String[] args) {
		String str_;
		str_=str.load_S("Podaj wyraz : ");
		for(char i='a';i<='z';i++){
			if(str.string_c(str_, i)>0){
			System.out.println("Liaera "+i+" wystepuje : "+str.string_c(str_, i)+" razy");
			}
		}
		for(char i='A';i<='Z';i++){
			if(str.string_c(str_, i)>0){
			System.out.println("Liaera "+i+" wystepuje : "+str.string_c(str_, i)+" razy");
			}
		}
			
	}
}
	

