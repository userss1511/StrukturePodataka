package cas5;

public class Main {

	public static boolean duplikat(String niz[], String podstring, int br) {
		for(int i = 0; i < br; i++) {
			if(podstring.equals(niz[i])) return true; 
		}
		return false;
	}
	
	public static void zad1(String str, int k) {
		String niz[] = new String[str.length() - k + 1];
		int br = 0;
		for(int i = 0; i <= str.length() - k; i++) {
			String podstring = str.substring(i, i+k);
			if(str.indexOf(podstring, i+1) != -1) {
				if(duplikat(niz, podstring, br) == false) {
					niz[br] = podstring;
					br++;
				}
			}
		}
		
		for(int i = 0; i < br; i++) {
			System.out.println(niz[i]);
		}
	}
	
	public static boolean broj(String str) {
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c) == false) return false;
		}
		
		return true;
	}
	
	public static boolean zad2(String ip) {
		String nizStringova[] = ip.split("[.]");
		/*for(int i = 0; i < nizStringova.length; i++) {
			System.out.println(nizStringova[i]);
		}*/
		if(nizStringova.length != 4) return false;
		for(int i = 0; i < nizStringova.length; i++) {
			
		if(broj(nizStringova[i])) {
			int vrijednost = Integer.parseInt(nizStringova[i]); 
			if(nizStringova[i].length() > 1 && nizStringova[i].charAt(0) == '0') return false;
			if(vrijednost < 0 || vrijednost > 255) return false;
		}
		else return false;
		}
		return true;
	}
	
	public static boolean zad3(String email) {
		String nizStringova[] = email.split("[@]");
		if(nizStringova.length != 2) return false;
		
		String prefiks = nizStringova[0];
		String domen = nizStringova[1];
		int slovo = 0, broj = 0;
		
		for(int i = 0; i < prefiks.length(); i++) {
			if(i+1 < prefiks.length() && prefiks.charAt(i) == '.' && prefiks.charAt(i+1) == '.') return false;
			char c = prefiks.charAt(i);
			if(Character.isAlphabetic(c)) slovo++;
			else if(Character.isDigit(c)) broj++;
			else if(c != '_' && c != '-' && c != '.') return false;
		}
		
		if(slovo == 0 && broj == 0) return false;
		char pocetakP = prefiks.charAt(0);
		char krajP = prefiks.charAt(prefiks.length() - 1);
		if(Character.isAlphabetic(pocetakP) == false && Character.isDigit(pocetakP)) return false;
		if(Character.isAlphabetic(krajP) == false && Character.isDigit(krajP) == false) return false;
		
		for(int i = 0; i < domen.length(); i++) {
			if(i+1 < domen.length() && domen.charAt(i) == '.' && domen.charAt(i+1) == '.') return false;
			char c = domen.charAt(i);
			if(Character.isAlphabetic(c) == false && Character.isDigit(c) == false 
			   && c != '-' && c != '.') return false;
		}
		
		int pretposlednjiD = domen.charAt(domen.length() - 2);
		int poslednjiD = domen.charAt(domen.length() - 1);
		
		if(Character.isAlphabetic(pretposlednjiD) == false || Character.isAlphabetic(poslednjiD) == false) return false;
		return true;
	}
	
	public static String transformacijaStringa(String str) {
		String rez = "";
		for(int i = str.length()-1; i >= 0; i--) {
			char c = str.charAt(i);
			rez += c;
		}
		
		return rez;
	}
	
	public static void zad4(String str) {
		String nizStringova[] = str.split("[ ]");
		String rez = "";
		
		for(int i = 0; i < nizStringova.length; i++) {
			String str1 = transformacijaStringa(nizStringova[i]);
			rez += str1 + " ";
		}
		
		System.out.println(rez);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//zad1("AAAAACCCCCAAAAACCCCCAAAAAGGGTTT", 10);
		//System.out.println(zad2("192.168.1x1"));
		//System.out.println(zad3("sara15@gmail.com"));
		zad4("Kurs iz programskog jezika Java");
	}

}
