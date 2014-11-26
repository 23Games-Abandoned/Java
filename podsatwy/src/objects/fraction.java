package objects;

import java.util.Scanner;

public class fraction {

	public int mian;
	
	public int licz;
	
	
	public static Scanner cin;
	
	public static int NWD(int a1, int a2){	//NWD
        if (a2 == 0) {
            return a1;  
        }
        else {   
            return NWD(a2, a1%a2);  
        }
    }
	
	public static int NWW(int a1,int a2){	//NWW
		return(a1*a2) / NWD(a1, a2);
	}
			
	
	
	public static int load(String text){	//wypisanie textu i wczytanie inta 
		System.out.print(text);
		return cin.nextInt();
	}
	
	public void load_u(){	//wypisanie textu i wczytanie inta u�amek
		licz=load("licznik ");
		mian=load("mianownik ");
	}
	
	public void out_u(){	//wypisanie ulamka
		System.out.println(licz+"/"+mian);
	}
	
	public void u_sum(fraction u1,fraction u2){	//test ulamk�w
		if(u1.mian==u2.mian){
			this.sum(u1,u2);
		}
		else{
			this.u_pd(u1,u2);
			this.sum(u1,u2);
		}
		

	}
	
	public void u_sk(fraction u1,fraction u2){	//skraqcanie ulamkow
		if (this.licz==this.mian){
			this.licz=1;
			this.mian=1;
		}
		else{
			if(NWD(u1.licz,u1.mian)>1){
				int a=NWD(this.licz,this.mian);
				this.licz=this.licz/a;
				this.mian=this.mian/a;
			}
			else{
				System.out.print("Nie da sie skr�cic!  ");
			}
		}
	}
	
	public void u_pd(fraction u1,fraction u2){	//monrzenie ulamkow
		int a=u1.mian*u2.mian;
		u1.licz=u1.licz*(a/u1.mian);
		u2.licz=u2.licz*(a/u2.mian);
		u1.mian=a;
		u2.mian=a;
		
		
	}
	
	public void sum(fraction u1,fraction u2){	//dodawanie ulamk�w
		if(u1.mian==u2.mian){
			this.licz=u1.licz+u2.licz;
			this.mian=u1.mian;
		
		}
		else{
			System.out.println("nidy rydy p�ki co");
		}
	}
	
	
}
	

