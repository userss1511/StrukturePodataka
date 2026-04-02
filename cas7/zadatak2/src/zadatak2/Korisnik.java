package zadatak2;

import java.util.LinkedList;

public class Korisnik {

	String imeKorisnika;
	LinkedList<Korisnik> pratioci;
	LinkedList<String> objave;
	
	
	public Korisnik(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
		this.pratioci = new LinkedList<Korisnik>();
		this.objave = new LinkedList<String>();
	}

	public void prikaziPratioce() {
		for(Korisnik k : pratioci) {
			System.out.println(k.imeKorisnika);
		}
		System.out.println();
	}

	public void prikaziObjave() {
		for(String o : objave) {
			System.out.println(o);
		}
		System.out.println();
	}
	
	public void dodajObjavu(String tekst) {
		objave.add(tekst);
	}
	
	public void zaprati(Korisnik k) {
		k.pratioci.add(this);
	}
	
	public void otprati(Korisnik k) {
		k.pratioci.remove(this);			
	}
	
	public boolean prati(Korisnik k1, Korisnik k2) {
		for(Korisnik p : k1.pratioci) {
			if(p.imeKorisnika.equals(k2.imeKorisnika)) return true;
		}
		
		return false;
	}
	
	public void pronadjiFanove() {
		for(Korisnik p : pratioci) {
			//da li this prati p 
			if(!prati(p, this)) {
				System.out.println(p.imeKorisnika);
			}
		}
		
	}

}
