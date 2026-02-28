package cas2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner unos = new Scanner(System.in);
	
	public static void unosNiza(int niz[]) {
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
	
	public static void zad1(int niz[]) {
		int maxSuma = Integer.MIN_VALUE;
		int maxPoc = -1;
		int maxD = 0;
		
		for(int d = 1; d <= niz.length; d++) { //duzina podniza
			for(int poc = 0; poc <= niz.length - d; poc++) { //pocetni indeks podniza
				int suma = 0;
				for(int i = poc; i < poc+d; i++) { // prolazenje elementima podniza
					suma += niz[i];
				}
				if(suma > maxSuma) {
					maxSuma = suma;
					maxPoc = poc;
					maxD = d;
				}
			}
		}
		
		for(int i = maxPoc; i < maxPoc + maxD; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}

	public static void zad1Optimizovano(int niz[]) {
		int maxSuma = Integer.MIN_VALUE;
		int maxPoc = -1;
		int maxD = 0;
		
		int prefiksneSume[] = new int[niz.length+1];
		prefiksneSume[0] = 0;
		
		for(int i = 1; i < niz.length; i++) {
			prefiksneSume[i] = prefiksneSume[i-1] + niz[i-1];
		}
		
		for(int d = 1; d <= niz.length; d++) {
			for(int poc = 0; poc <= niz.length-d; poc++) {
				int suma = prefiksneSume[poc+d] - prefiksneSume[poc];
				if(suma > maxSuma) {
					maxSuma = suma;
					maxPoc = poc;
					maxD = d;
				}
			}
		}
		
		for(int i = maxPoc; i < maxPoc + maxD; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}
	
	public static void unosMatrice(int mat[][]) {
		int m = mat.length; //koliko imate redova
		int n = mat[0].length; //koliko imate kolona
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = unos.nextInt();
			}
		}
	}
	
	public static void stampaMatrice(int mat[][]) {
		int m = mat.length;
		int n = mat[0].length;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void zad2(int mat[][]) {
		int suma = 0;
		int m = mat.length;
		int n = mat[0].length;
		
		/*for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(i % 2 == 0 && j % 2 == 1) {
					suma += mat[i][j];
				}
			}
		}*/
		
		for(int i = 0; i < m; i+=2) {
			for(int j = 1; j < n; j+=2) {
				suma = suma + mat[i][j];
			}
		}
		
		System.out.println(suma);
	}
	
	public static void popuniMatricuRandom(int mat[][]) {
		Random r = new Random();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = r.nextInt(100);
			}
		}
	}
	
	public static boolean zad3(int mat[][]) {
		if(mat.length != mat[0].length) return false;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] != mat[j][i]) return false;
			}
		}
		
		return true;
	}

	public static int[][] zad4(int mat[][]){
		int m = mat.length;
		int n = mat[0].length;
		int rez[][] = new int[n][m];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				rez[j][m-i-1] = mat[i][j];
			}
		}
		
		return rez;
	}
		
	public static void promjenaSmjera(int smjer[]) {
		if(smjer[0] == 0 && smjer[1] == 1) { //isli smo desno
			smjer[0] = 1; //prelazimo dolje
			smjer[1] = 0;
		}
		else if(smjer[0] == 1 && smjer[1] == 0) {//isli smo dolje
			smjer[0] = 0; //prelazimo lijevo
			smjer[1] = -1;
		}
		else if(smjer[0] == 0 && smjer[1] == -1) {//isli smo lijevo
			smjer[0] = -1;//prelazimo gore
			smjer[1] = 0;
		}
		else {//isli smo gore
			smjer[0] = 0; //prelazimo desno
			smjer[1] = 1;
		}
	}
	
	public static void zad5(int mat[][]) {
		int m = mat.length;
		int n = mat[0].length;
		int brojac = 1;
		int smjer[] = {0, 1};
		//(0, 1) desno 
		//(1, 0) dolje
		//(0, -1) lijevo
		//(-1, 0) gore
		int i = 0, j = 0;
		
		while(brojac <= m*n) {
			mat[i][j] = brojac;
			brojac++;
			
			int novo_i = i + smjer[0];
			int novo_j = j + smjer[1];
			
			if(novo_i < 0 || novo_j < 0 || novo_i >= m || novo_j >= n || mat[novo_i][novo_j] != 0) {
				promjenaSmjera(smjer);
				novo_i = i + smjer[0];
				novo_j = j + smjer[1];
				
			}
			i = novo_i;
			j = novo_j;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = unos.nextInt();
		int n = unos.nextInt();
		//int niz[] = new int[n];
		//unosNiza(niz);
		//stampaNiza(niz);
		//zad1(niz);
		//zad1Optimizovano(niz);
		//-2 1 -3 4 -1 2 1 -5 4
		//8 -7 -3 5 6 -2 3 -4 2
		int mat[][] = new int[m][n];
		//unosMatrice(mat);
		//popuniMatricuRandom(mat);
		//stampaMatrice(mat);
		//zad2(mat);
		//System.out.println(zad3(mat));
		//stampaMatrice(zad4(mat));
		zad5(mat);
		stampaMatrice(mat);
		
		/*
			4 4
			1 5 2 7
			5 2 3 10
			2 3 3 4
			7 10 4 5
		 */
	}

}
