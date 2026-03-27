package zadatak2;

public class Cvor {
	String rijec;
	Cvor sledeci;
	
	public Cvor(String rijec) {
		this.rijec = rijec;
		this.sledeci = null;
	}
	
	
	public int HemingovoRastojanje(String str1, String str2) {
		int br = Math.abs(str1.length() - str2.length());
		for(int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
			if(str1.charAt(i) != str2.charAt(i)) br++;
		}
		return br;
	}
	
	
	
}
