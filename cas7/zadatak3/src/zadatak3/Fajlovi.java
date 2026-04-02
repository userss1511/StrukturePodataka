package zadatak3;

public class Fajlovi {

	Cvor glava;
	
	public void stampajListu() {
		Cvor tren = this.glava;
		
		while(tren != null) {
			//System.out.println(tren);
			System.out.println(tren.imeFajla + " (" + tren.sadrzaj + ")");
			tren = tren.sledeci;
		}
		System.out.println();
	}

	public void dodajFajl(String imeFajla, String sadrzaj) {
		Cvor novi = new Cvor(imeFajla, sadrzaj);
		Cvor tren = this.glava;
		Cvor pret = null;
		
		while(tren != null && tren.imeFajla.compareTo(imeFajla) < 0) {
			pret = tren;
			tren = tren.sledeci;
		}
		
		//if(tren != null && tren.imeFajla.equals(imeFajla)) return;
		
		novi.sledeci = tren;
		if(pret == null) this.glava = novi;
		else pret.sledeci = novi;
		
	}
	
	public void pronadjiFajlove(String tekst) {
		Cvor tren = this.glava;
		while(tren != null) {
			if(tren.imeFajla.contains(tekst)) {
				System.out.println(tren);
			}
			
			tren = tren.sledeci;
		}
	}

	public void pronadjiDuplikate() {
		Cvor tren1 = this.glava;
		while(tren1 != null) {
			Cvor tren2 = tren1.sledeci;
			while(tren2 != null) {
				if(tren1.compareTo(tren2) == 0) {
					System.out.println(tren1 + " " + tren2);
				}
				tren2 = tren2.sledeci;
			}
			tren1 = tren1.sledeci;
		}
		
	}

}
