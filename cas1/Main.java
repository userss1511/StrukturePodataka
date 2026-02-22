package cas1;

import java.util.Scanner;

public class Main {

	public static Scanner unos = new Scanner(System.in);
	public static void unesiNiz(int niz[]) {
		//Scanner unos = new Scanner(System.in);
		for(int i = 0; i < niz.length; i++) {
			niz[i] = unos.nextInt();
		}
	}
	
	public static void stampaNiza(int niz[]) {
		for(int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}
		
	public static int zad1(int niz[], int k) {
		int brojac = 0;
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] % 2 == 0 && niz[i] > k) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void zad2(int niz[]) {
		for(int i = 0; i < niz.length; i++) {
			int suma_prije = 0;
			int suma_posle = 0;
			
			for(int j = 0; j < i; j++) {
				suma_prije = suma_prije + niz[j];
			}
			
			for(int j = i+1; j < niz.length; j++) {
				suma_posle = suma_posle + niz[j];
			}
			
			if(suma_posle == suma_prije) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public static void zad2Optimizovano(int niz[]) {
		int suma_prije = 0;
		int suma_posle = 0;
		
		for(int i = 1; i < niz.length; i++) {
			suma_posle = suma_posle + niz[i];
		}
		
		for(int i = 0; i < niz.length; i++) {
			if(suma_prije == suma_posle) {
				System.out.print(i + " ");
			}
			suma_prije = suma_prije + niz[i];
			if(i+1 < niz.length) {
			suma_posle = suma_posle - niz[i+1];
			}
			else suma_posle = 0;
		}
		
	}
	
	public static int brPojavljivanjaFunkcija(int niz[], int i) {
		int brPojavljivanja = 1;
		for(int j = 0; j < niz.length; j++) {
			if(i != j && niz[i] == niz[j]) brPojavljivanja++;
		}
		return brPojavljivanja;
	}
	
	public static int zad3(int niz[]) {
		int maxP = 0;
		int maxEl = 0;
		for(int i = 0; i < niz.length; i++) {
			/*int brojPojavljivanja = 1;
			for(int j = 0; j < niz.length; j++) {
				if(i != j && niz[i] == niz[j])
					brojPojavljivanja += 1;
			}*/
			int brojPojavljivanja = brPojavljivanjaFunkcija(niz, i);
			if(brojPojavljivanja > maxP) {
				maxP = brojPojavljivanja;
				maxEl = niz[i];
			}
		}
		return maxEl;
	}
	
	public static void rotacija(int niz[]) {
		int pom = niz[0];
		for(int i = 0; i < niz.length-1; i++) {
			niz[i] = niz[i+1];
		}
		
		niz[niz.length-1] = pom;
		
	}
	
	public static void zad4(int niz[], int k) {
		for(int i = 0; i < k; i++) {
			rotacija(niz);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = unos.nextInt();
		//Scanner unos = new Scanner(System.in);
		int niz[] = new int[n];
		unesiNiz(niz);
		//stampaNiza(niz);
		//System.out.println(zad1(niz, 3));
		//zad2(niz);
		//System.out.println();
		//zad2Optimizovano(niz);
		//0, -3, 5, -4, -2, 3, 1, 0
		//System.out.println(zad3(niz));
		stampaNiza(niz);
		//rotacija(niz);
		zad4(niz, 3);
		//2, 5, 4, 7, 3
		stampaNiza(niz);

	}

}
