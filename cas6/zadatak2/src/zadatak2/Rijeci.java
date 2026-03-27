package zadatak2;

public class Rijeci {
	Cvor glava;
	
	public void stampajListu() {
		Cvor tren = this.glava;
		
		while(tren != null) {
			System.out.print(tren.rijec + " ");
			tren = tren.sledeci;
		}
		System.out.println();
	}

	public void dodaj(String d) {
		Cvor tren = this.glava;
		Cvor pret = null;
		
		while(tren != null && tren.rijec.compareTo(d) < 0) {
			pret = tren;
			tren = tren.sledeci;
		}
		if(tren.rijec.compareTo(d) == 0)return;
		Cvor novi = new Cvor(d);
		
		novi.sledeci = tren;
		if(pret == null) {
			this.glava = novi;
			
		}
		else pret.sledeci = novi;
	}

	public void obrisi(String d, int k) {
		Cvor tren = this.glava;
		Cvor pret = null;
		
		while(tren != null) {
			if(tren.HemingovoRastojanje(d, tren.rijec) > k) {
				//obrisati cvor
				if(pret == null) {
					this.glava = this.glava.sledeci;
					tren = glava;
				}
				else {
					pret.sledeci = tren.sledeci;
					tren = tren.sledeci;
				}
			}
			else {
				pret = tren;
				tren = tren.sledeci;
			}
		}
	}
}
