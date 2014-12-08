package functions;

import java.util.Scanner;

public class str {
	
	public static Scanner cin=new Scanner(System.in);

	public static int load(String text){	//wypisanie textu i wczytanie inta 
		System.out.print(text);
		return cin.nextInt();
	}
		
	public static String load_S(String text){	//wypisanie textu i wczytanie inta 
		System.out.print(text);
		return cin.nextLine();
	}
	
	public static void out_S(String str){
	System.out.println(str);
	}
	
	public static int string_u(String str){
		int s=0;
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))){
				s++;
			}
		}
		return s;
	}
	
	public static String string_r(String str){
		return new StringBuilder(str).reverse().toString();
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
	
	
	public static String toRoman(int number) {
		String i="";
        while (number>0) {
        if (number>1000){ 
        	number-=1000;
        	i+="M";
        }
        if (number>900){ 
        	number-=900;
        	i+="CM";
        }
        if (number>500){ 
        	number-=500;
        	i+="D";
        }
        if (number>400){ 
        	number-=400;
        	i+="CD";
        }
        if (number>100){ 
        	number-=100;
        	i+="C";
        }
        if (number>90){ 
        	number-=90;
        	i+="XC";
        }
        if (number>50){ 
        	number-=50;
        	i+="L";
        }
        if (number>40){ 
        	number-=40;
        	i+="XL";
        }
        if (number>10){ 
        	number-=10;
        	i+="X";
        }
        if (number>9){ 
        	number-=9;
        	i+="IX";
        }
        if (number>5){ 
        	number-=5;
        	i+="V";
        }
        if (number>4){ 
        	number-=4;
        	i+="IV";
        }
        if (number>1){ 
        	number-=1;
        	i+="I";
        }
        }
        return i;
    }
	
	public static int toArabic(String number) {
		int i=0;
        while (number.length()>0) {
        if (number.endsWith("M")){ 
        	i+= 1000;
        	number=number.substring(0, number.length()-1);
        }
        if (number.endsWith("CM")){
        	i+= 900 ;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("D")){ 
        	i+= 500 ;
        	number=(number.substring(0, number.length()-1));
        }
        if (number.endsWith("CD")){
        	i+= 400 ;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("C")){ 
        	i+= 100 ;
        	number=(number.substring(0, number.length()-1));
        }
        if (number.endsWith("XC")){ 
        	i+= 90 ;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("L")){ 
        	i+= 50 ;
        	number=(number.substring(0, number.length()-1));
        }
        if (number.endsWith("XL")){ 
        	i+= 40;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("X")){ 
        	i+= 10 ;
        	number=(number.substring(0,number.length()-1));
        }
        if (number.endsWith("IX")){ 
        	i+= 9;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("V")){ 
        	i+= 5 ;
        	number=(number.substring(0, number.length()-1));
        }
        if (number.endsWith("IV")){ 
        	i+= 4 ;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("I")){ 
        	i+= 1 ;
        	number=(number.substring(0, number.length()-1));
        	
        }
        }
        return i;
    }
	
	public static void pal(String str){
		boolean b=true;
		for (int i=0;i<str.length()/2;i++){
			if (str.charAt(i)!=str.charAt(str.length()-1-i)){
				b=false;
			}
		}
		if (b==true){
			System.out.println(str+" jest palindromem");
		}
	} 
	
	public static String spacer(String str) {
		String fstr="";
		for (int i=0;i<str.length();i++){
			fstr+=str.charAt(i)+" ";
		}
		return fstr;
	}
	
	public static String char_out(String str, String a) {
		String r_str="";
		String[] parts = str.split(a);
		for(int i=0;i<parts.length;i++){
			r_str+=parts[i];
		}
		return r_str;
	}
	
	public static String flip(String str) {
		String fstr="",a="";
		if(str.length()%2!=0){
			a=Character.toString(str.charAt((str.length()-1)));
		}
		for (int i=0;i<str.length()-1;i+=2){
			fstr+=Character.toString(str.charAt(i+1))+Character.toString(str.charAt(i));
		}
		return fstr+a;
	}
	
	
	public static void plec (String str){
		if(str.endsWith("a")){
			System.out.print(str+" jestes kobiet�!!!");
		}	
	}
}
