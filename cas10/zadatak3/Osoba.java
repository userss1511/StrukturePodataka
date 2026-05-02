package zadatak3;

public class Osoba implements Comparable{

	int id;
	double suma;
	
	
	public Osoba(int id, double suma) {
		this.id = id;
		this.suma = suma;
	}
	
	
	@Override
	public int compareTo(Object o) {
	    Osoba s = (Osoba) o;
	    return Double.compare(s.suma, this.suma);
	}
	
}
