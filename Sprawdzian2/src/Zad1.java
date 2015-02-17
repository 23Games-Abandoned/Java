
public class Zad1 {
	
	public static int p=0,m=0;

	public static void main(String[] args) {
		int[] tab = new int[10];
		for (int i=0;i<=tab.length-1;i++){
			tab[i]=(int) (Math.random()*81-41);
		}

		System.out.println("Tablica nie posortowana");
		for (int i=0;i<=tab.length-1;i++){
			System.out.print (tab[i]+" ");
		}

		System.out.println();
		for (int i=0;i<=tab.length-1;i++){
			if (tab[i]>0){
				p+=tab[i];
			} else {
				m+=tab[i];
			}
		}//Dupa pozdrawiam
		
		System.out.println("Suma dodatnich wynosi: "+p);
		System.out.println("Suma ujemnych wynosi: "+m);
	}

}
