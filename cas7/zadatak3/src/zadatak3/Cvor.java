package zadatak3;

public class Cvor {
	
	String imeFajla;
	String sadrzaj;
	Cvor sledeci;
	
	
	public Cvor(String imeFajla, String sadrzaj) {
		this.imeFajla = imeFajla;
		this.sadrzaj = sadrzaj;
		this.sledeci = null;
	}


	@Override
	public String toString() {
		return imeFajla + " (" + sadrzaj + ")";
	}
	
	
	public int compareTo(Cvor c) {
		if(this.sadrzaj.compareTo(c.sadrzaj) < 0) return -1;
		else if(this.sadrzaj.compareTo(c.sadrzaj) == 0) return 0;
		else return 1;
	}
	
	
	
	
}
