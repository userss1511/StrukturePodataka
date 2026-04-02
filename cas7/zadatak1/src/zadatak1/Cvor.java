package zadatak1;

public class Cvor {
	
	String vlasnik;
	String banka;
	float iznos;
	Cvor sledeci;
	
	public Cvor(String vlasnik, String banka, float iznos) {
		this.vlasnik = vlasnik;
		this.banka = banka;
		this.iznos = iznos;
		this.sledeci = null;
	}

	@Override
	public String toString() {
		return vlasnik + " - " + banka + "(" + iznos + ")";
	}
	
	
	
	
	
}
