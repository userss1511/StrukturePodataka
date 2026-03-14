package cas4;

import java.util.Scanner;

public class Main {
	
	public static String cezar(String str, int k) {
		String rez = "";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int pozicija = (c - 'a' + k)% 26;
			char t = (char)(pozicija + 'a');
			rez += t;
		}
		return rez;
		
	}

	public static int zad2(String str) {
		int broj = 0;
		int i = 0;
		
		while(i < str.length()) {
			char c = str.charAt(i);
			
			if(c == 'M') {
				broj += 1000; //broj = broj + 1000;
				i++;
			}
			
			else if(c == 'D') {
				broj += 500;
				i++;
			}
			else if(c == 'C') {
				if(i+1 < str.length() && str.charAt(i+1) == 'D') {
					broj += 400;
					i += 2;
				}
				else if(i+1 < str.length() && str.charAt(i+1) == 'M') {
					broj += 900;
					i += 2;
				}
				else {
					broj += 100;
					i++;
				}
			}
			else if(c == 'L') {
				broj += 50;
				i++;
			}
			else if(c == 'X') {
				if(i+1 < str.length() && str.charAt(i+1) == 'L') {
					broj += 40;
					i += 2;
				}
				else if(i+1 < str.length() && str.charAt(i+1) == 'C') {
					broj += 90;
					i += 2;
				}
				else {
					broj += 10;
					i++;
				}
			}
			
			else if(c == 'V') {
				broj += 5;
				i++;
			}
			else if(c == 'I') {
				if(i+1 < str.length() && str.charAt(i+1) == 'V') {
					broj += 4;
					i += 2;
				}
				else if(i+1 < str.length() && str.charAt(i+1) == 'X') {
					broj += 9;
					i += 2;
				}
				else {
					broj += 1;
					i++;
				}
			}
		}
		
		return broj;
		
	}
	
	public static boolean zad3(String str) {
		if(str.length() < 8) return false;
		int velikaSlova = 0, malaSlova = 0, cifre = 0, specKarakteri = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(Character.isUpperCase(c)) velikaSlova += 1;
			if(Character.isLowerCase(c)) malaSlova += 1;
			if(Character.isDigit(c)) cifre += 1;
			if(c == '$' || c == '#' || c == '@') specKarakteri += 1;
			
			
		}
		
		if(velikaSlova == 0 || malaSlova == 0 || cifre == 0 || specKarakteri == 0) return false;
		return true;
		
	}
	
	public static boolean palindrom(String str) {
		String pomStr = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			char c = str.charAt(i);			
			pomStr += c;			
		}
		
		if(pomStr.equals(str)) return true;
		return false;
		
	}
	
	public static String zad4(String str) {
		for(int d = str.length(); d > 0; d--) { //duzina podstringa
			for(int i = 0; i < str.length() - d; i++) { //pocetni indeks podstringa
				String podstring = str.substring(i, i+d);
				if(palindrom(podstring)) return podstring;
			}
		}
	
		return "";
	}
	
	public static boolean zad5(String str1, String str2) {
		int niz1[] = new int[26];
		int niz2[] = new int[26];
		
		for(int i = 0; i < str1.length(); i++) {
			int c = str1.charAt(i);
			niz1[c - 'a']++;
		}
		
		for(int i = 0; i < str2.length(); i++) {
			int c = str2.charAt(i);
			niz2[c - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(niz1[i] != niz2[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		//String str = unos.nextLine();
		//System.out.println(cezar(str, 5));
		//System.out.println(zad2(str));
		//System.out.println(zad3(str));
		//System.out.println(palindrom(str));
		//System.out.println(zad4(str));
		System.out.println(zad5("ortoped", "torpedo"));
	}

}
