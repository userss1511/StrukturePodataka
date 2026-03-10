package cas3;

import java.util.Scanner;

public class Main {

	public static Scanner unos = new Scanner(System.in);
	
	public static void zad1() {
		int m = unos.nextInt();
		int n = unos.nextInt();
		int k = unos.nextInt();
		float mat[][] = new float[m][n];
		float sume[] = new float[n];
		boolean preskoci[] = new boolean[n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = unos.nextFloat();
				sume[j] = sume[j] + mat[i][j];
			}
		}
		
		/*for(int i = 0; i < n; i++) {
			System.out.print(sume[i] + " ");
		}
		System.out.println();*/
		
		for(int i = 0; i < k; i++) {
			float maxSuma = Float.MIN_VALUE;
			int maxInd = -1;
			for(int j = 0; j < n; j++) {
				if(preskoci[j] == false && sume[j] > maxSuma) {
					maxSuma = sume[j];
					maxInd = j;
				}
			}
			System.out.println(maxInd);
			preskoci[maxInd] = true;
		}
		
	}
	
	public static void zad2() {
		int m = unos.nextInt();
		int n = unos.nextInt();
		int k = unos.nextInt();
		int mat[][] = new int[m][n];
		int filtar[][] = new int[k][k];
		int rez[][] = new int[m-k+1][n-k+1];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = unos.nextInt();
			}
		}
		
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < k; j++) {
				filtar[i][j] = unos.nextInt();
			}
		}
		
		for(int i = 0; i < m-k+1; i++) {
			for(int j = 0; j < n-k+1; j++) {
				for(int i1 = 0; i1 < k; i1++) {
					for(int j1 = 0; j1 < k; j1++) {
						rez[i][j] +=  mat[i+i1][j+j1] * filtar[i1][j1];
					}
				}
			}
		}
		
		for(int i = 0; i < m-k+1; i++) {
			for(int j = 0; j < n-k+1; j++) {
				System.out.print(rez[i][j] + " ");
			}
			System.out.println();
		}
}
	
	public static void zad3(String s) {
		String samoglasnici = "";
		String suglasnici = "";
		String pom = "aeiouAEIOU";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(pom.indexOf(c) != -1){
				
			}
			/*if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
			   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				samoglasnici += c;				
			}*/
			else {
				suglasnici += c;
			}
		}
		
		System.out.println(samoglasnici);
		System.out.println(suglasnici);
		
	}
	
	public static void zad4(String s) {
		String rez = "";
		for(int i = s.length()- 1; i >= 0; i--) {
			char c = s.charAt(i);
			rez = rez + c;
		}
		
		System.out.println(rez);
	}
	
	public static String zad5(String s) {
		String rez = "";
		for(int i = 0; i < s.length()-1; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			if(Character.isUpperCase(c1) && Character.isUpperCase(c2)) {
				rez += c1;
				rez += '_';
			}
			else rez += c1; 
		}
		
		rez += s.charAt(s.length()-1);
		return rez;
	}
	
	public static void zad6(String s) {
		String rez = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				rez += c;
				rez += Character.toLowerCase(c);
			}
			else rez += c;
		}
		
		System.out.println(rez);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//zad1();
		//zad2();
		
		/*char c = 'A';
		int x = 1;
		// x != c
		String str = "Programiranje";
		System.out.println(str);
		System.out.println(str.charAt(4));
		System.out.println(str.equals("Programiranje1"));
		System.out.println(str.indexOf('r'));
		System.out.println(str.lastIndexOf('r'));
		System.out.println(str.substring(3, 5));
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isUpperCase(c));*/
		String s = unos.nextLine();
		//zad3(s);
		//zad4(s);
		//System.out.println(zad5(s));
		//zad6(s);
		
	}

}
