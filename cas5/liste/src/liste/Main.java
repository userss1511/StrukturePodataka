package liste;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cvor c1 = new Cvor(1);
		Cvor c2 = new Cvor(2);
		Cvor c3 = new Cvor(3);
		Cvor c4 = new Cvor(4);
		Cvor c5 = new Cvor(5);
		
		Lista l1 = new Lista();
		c1.sledeci = c2;
		c2.sledeci = c3;
		c3.sledeci = c4;
		c4.sledeci = c5;
		l1.glava = c1;
		
		//stampa liste
		//dodavanje cvora na pocetak liste
		//koliko elemenata ima lista
		//dodavanje cvora na kraj liste
		//brisanje cvora sa pocetka
		//brisanje cvora sa kraja
		//brisanje cvora koji vrijednost v
		
		l1.stampaListe();
		l1.dodajNaPocetak(7);
		//l1.dodajNaPocetak(8);
		l1.stampaListe();
		System.out.println(l1.duzinaListe());
		l1.dodajNaKrajListe(6);
		l1.stampaListe();
		l1.obrisiSaPocetka();
		l1.stampaListe();
		l1.obrisiSaKraja();
		l1.stampaListe();
		l1.obrisiCvor(9);
		l1.stampaListe();
	}

}
