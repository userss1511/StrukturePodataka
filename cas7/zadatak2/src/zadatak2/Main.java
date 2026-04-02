package zadatak2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Korisnik k1 = new Korisnik("Marko");
		Korisnik k2 = new Korisnik("Ana");
		Korisnik k3 = new Korisnik("Jana");
		String o1 = "objava1";
		String o2 = "objava2";
		String o3 = "objava3";
		//k1.prikaziPratioce();
		k1.dodajObjavu(o1);
		k1.dodajObjavu(o2);
		k1.dodajObjavu(o3);
		//k1.prikaziObjave();
		//k2.prikaziObjave();
		k2.zaprati(k1);
		k3.zaprati(k1);
		k1.prikaziPratioce();
		//k2.otprati(k1);
		//k1.prikaziPratioce();
		k1.zaprati(k2);
		k1.pronadjiFanove();
		
	}

}
