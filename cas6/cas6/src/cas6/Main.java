package cas6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cvor c1 = new Cvor(1);
		Cvor c2 = new Cvor(2);
		Cvor c3 = new Cvor(3);
		Cvor c4 = new Cvor(4);
		Cvor c5 = new Cvor(5);
		MojaLista l1 = new MojaLista();
		l1.glava = c1;
		c1.sledeci = c2;
		c2.sledeci = c3;
		c3.sledeci = c4; 
		c4.sledeci = c5;
		l1.stampajListu();
		//l1.dodaj1();
		//l1.dodaj2(3);
		//l1.dodaj3(0, 6);
		//l1.dodaj4(-1, 3);
		//l1.obrisi(4, 1);
		//l1.stampajListu();
		l1.pronadjiSredinu();
		
	}

}
