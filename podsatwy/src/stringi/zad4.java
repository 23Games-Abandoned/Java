package stringi;

import functions.str;

public class zad4 {

	public static void main(String[] args) {
		String str_;
		str_=str.load_S("Podaj wyraz : ");
		System.out.print("Liaera "+"a "+"wystepuje : "+str.string_c(str_, 'a')+" razy");
		
	}
}