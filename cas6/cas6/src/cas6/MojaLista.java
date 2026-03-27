package cas6;

public class MojaLista {
	Cvor glava;
	
	public void stampajListu() {
		Cvor tren = this.glava;
		
		while(tren != null) {
			System.out.print(tren.vrijednost + " ");
			tren = tren.sledeci;
		}
		System.out.println();
	}
	
	public void dodaj1() {
		Cvor tren = this.glava;
		//if(tren == null) return;
		while(tren.sledeci != null) {
			int v1 = tren.vrijednost; //a[i] 
			int v2 = tren.sledeci.vrijednost; //a[i+1]
			int v3 = v1-v2;
			Cvor novi = new Cvor(v3);
			novi.sledeci = tren.sledeci;
			tren.sledeci = novi;
			tren = tren.sledeci.sledeci;
			
		}
	}

	public void dodaj2(int k) {
		Cvor tren = this.glava;
		
		while(tren != null) {
			int v = tren.vrijednost;
			if(v % k == 0) {
				Cvor novi = new Cvor(-1);
				novi.sledeci = tren.sledeci;
				tren.sledeci = novi;
				tren = tren.sledeci.sledeci;
			}
			else tren = tren.sledeci;
		}
	}
	
	public void dodaj3(int a, int b) { // v > a && v < b dodaj nulu
	Cvor tren = this.glava;
	
	while(tren != null) {
		int v = tren.vrijednost;
		if(v > a && v < b) {
			Cvor novi = new Cvor(0);
			novi.sledeci = tren.sledeci;
			tren.sledeci = novi;
			tren = tren.sledeci.sledeci;
		}
		else tren = tren.sledeci;
	}
	}

	public void dodaj4(int v, int k) {
		Cvor tren = this.glava;
		int brojac = 0;
		
		while(tren != null) {
			brojac += 1;
			if(brojac == k) {
				brojac = 0;
				//dodam novi cvor
				Cvor novi = new Cvor(v);
				novi.sledeci = tren.sledeci;
				tren.sledeci = novi;
				tren = tren.sledeci.sledeci;
			}
			else tren = tren.sledeci;
			
		}
		
	}

	public void obrisi(int d, int k) {
		Cvor tren = this.glava;
		Cvor pret = null;
		if(this.glava == null) return; //lista je prazna nema brisanja
		
		while(tren != null) {
			int v = tren.vrijednost;
			if(Math.abs(v - d) < k) {				
				if(pret == null) { //brisanje glave
					if(this.glava == null) return;
					this.glava = this.glava.sledeci;					
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

	public void pronadjiSredinu() {
		Cvor brzi = this.glava;
		Cvor spori = this.glava;
		
		while(brzi != null && brzi.sledeci!= null) {
			spori = spori.sledeci;
			brzi = brzi.sledeci.sledeci;
		}
		System.out.println(spori.vrijednost);
	}
}


