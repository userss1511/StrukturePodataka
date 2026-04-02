package zadatak1;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cvor c1 = new Cvor("Marko", "CKB", 2000);
		Cvor c2 = new Cvor("Ana", "Erste", 1000);
		
		c1.sledeci = c2;
		Racuni r = new Racuni();
		r.glava = c1;
		r.stampajListu();
		r.dodajRacun("Milica", "Hipotekarna", 1300);
		r.dodajRacun("Marko", "Erste", 100);
		//r.stampajListu();
		r.pronadjiRacune("Marko", "Erste");
		r.dodajRacun("Marko", "Hipotekarna", 10);
		r.dodajRacun("Ana", "Hipotekarna", 50);
		r.pronadjiVlasnika();
		
		/*LinkedList<String> lista = new LinkedList<String>();
		lista.add("a");
		lista.add("b");
		
		for(String str : lista) {
			System.out.println(str);
		}*/
	}

}
