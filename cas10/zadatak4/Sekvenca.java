package zadatak4;

public class Sekvenca implements Comparable{

	String tekst;
	int brojPojavljivanja;
	
	
	public Sekvenca(String tekst, int brojPojavljivanja) {
		this.tekst = tekst;
		this.brojPojavljivanja = brojPojavljivanja;
	}
	
	@Override
	public int compareTo(Object o) {
	    Sekvenca s = (Sekvenca) o;
	    return s.brojPojavljivanja - this.brojPojavljivanja;
	}
	
}
