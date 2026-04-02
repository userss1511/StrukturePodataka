package zadatak3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cvor c1 = new Cvor("fajl1.txt", "sadrzaj1");
		Cvor c2 = new Cvor("fajl2.txt", "sadrzaj2");
		Cvor c3 = new Cvor("fajl3.txt", "sadrzaj3");
		Cvor c4 = new Cvor("fajl5.txt", "sadrzaj5");
		c1.sledeci = c2;
		c2.sledeci = c3;
		c3.sledeci = c4;
		
		Fajlovi f = new Fajlovi();
		f.glava = c1;
		//System.out.println(c3);
		f.stampajListu();
		f.dodajFajl("fajl4.txt", "sadrzaj4");
		f.stampajListu();
		//f.pronadjiFajlove("1");
		f.pronadjiDuplikate();
	}

}
