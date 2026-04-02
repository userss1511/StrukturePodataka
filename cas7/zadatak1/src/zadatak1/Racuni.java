package zadatak1;

import java.util.LinkedList;

public class Racuni {

	Cvor glava;
	
	public void stampajListu() {
		Cvor tren = this.glava;
		
		while(tren != null) {
			//System.out.println(tren.vlasnik + " - " + tren.banka + "(" + tren.iznos + ")");
			System.out.println(tren);
			tren = tren.sledeci;
		}
		System.out.println();
	}
	
	public void dodajRacun(String vlasnik, String banka, float iznos) {
		Cvor novi = new Cvor(vlasnik, banka, iznos);
		Cvor pret = null;
		Cvor tren = this.glava;
		
		while(tren != null && tren.iznos > iznos) {
			pret = tren;
			tren = tren.sledeci;
		}
		
		novi.sledeci = tren;
		if(pret != null) pret.sledeci = novi;
		else this.glava = novi;
	}

	public void pronadjiRacune(String tekst1, String tekst2) {
		Cvor tren = this.glava;
		
		while(tren != null) {
			if(tren.vlasnik.equals(tekst1) && tren.banka.equals(tekst2)) {
				System.out.println(tren);
			}
			tren = tren.sledeci;
		}
		System.out.println();
	}
	
	public boolean postoji(LinkedList<String> lista, String vlasnik) {
		for(String v : lista) {
			if(v.equals(vlasnik)) return true;
		}
		
		return false;
	}
	
	public void pronadjiVlasnika() {
		Cvor tren1 = this.glava;
		LinkedList<String> lista = new LinkedList<String>();
		
		while(tren1 != null) {
			Cvor tren2 = tren1.sledeci;
			while(tren2 != null) {
				if(tren1.vlasnik.equals(tren2.vlasnik) && !tren1.banka.equals(tren2.banka)) {
				 if(!postoji(lista, tren1.vlasnik)) lista.add(tren1.vlasnik);
				}
				tren2 = tren2.sledeci;
			}
			tren1 = tren1.sledeci;
		}
		
		for(String v : lista) {
			System.out.println(v);
		}
		
	}

}


