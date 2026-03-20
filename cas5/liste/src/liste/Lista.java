package liste;

public class Lista {
	Cvor glava;

public void stampaListe() {
	Cvor tren = this.glava;
	
	while(tren != null) {
		System.out.print(tren.vrijednost + " ");
		tren = tren.sledeci;
	}
	
	System.out.println();
}

public void dodajNaPocetak(int v) {
	Cvor novi = new Cvor(v);
	novi.sledeci = this.glava;
	this.glava = novi;
}

public int duzinaListe() {
	int br = 0;
	Cvor tren = this.glava;
	
	while(tren != null) {
		br++;
		tren = tren.sledeci;
	}
	
	return br;
}

public void dodajNaKrajListe(int v) {
	Cvor novi = new Cvor(v);
	Cvor tren = this.glava;
	if(tren == null) dodajNaPocetak(v);
	while(tren.sledeci != null) {
		tren = tren.sledeci;
	}
	
	tren.sledeci = novi;
}

public void obrisiSaPocetka() {
	if(this.glava == null) return;
	this.glava = this.glava.sledeci;
}

public void obrisiSaKraja() {
	Cvor tren = this.glava;
	if(this.glava == null) return;
	
	while(tren.sledeci.sledeci != null) {
		tren = tren.sledeci;
	}
	
	tren.sledeci = null;
}

public void obrisiCvor(int v) {
	Cvor tren = this.glava;
	Cvor pret = null;
	if(this.glava == null) return;
	
	while(tren != null && tren.vrijednost != v) {
		pret = tren;
		tren = tren.sledeci;
	}
	if(pret == null) this.obrisiSaPocetka();
	if(tren == null) return;
	else {
		pret.sledeci = tren.sledeci;
	}
	
}

}
