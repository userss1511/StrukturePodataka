package zadatak2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cvor c1 = new Cvor("abc");
		Cvor c2 = new Cvor("dab");
		Rijeci r = new Rijeci();
		r.glava = c1;
		c1.sledeci = c2;
		//r.stampajListu();
		/*String str1 = "abc";
		String str2 = "bcd"; //abc < bcd
		System.out.println(str1.compareTo(str2));*/
		r.dodaj("bac");
		r.dodaj("aac");
		r.stampajListu();
		r.obrisi("abc", 2);
		r.stampajListu();
		//System.out.println(c1.HemingovoRastojanje("abc", "bbda"));
	}

}
