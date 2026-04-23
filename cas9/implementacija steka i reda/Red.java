package cas9;

public class Red {

	private int[] elementi;
	private int rear;
	private int velicina;
	private int kapacitet;
	
	
	public Red(int kapacitet) {
		this.elementi = new int[kapacitet];
		this.rear = -1;
		this.velicina = 0;
		this.kapacitet = kapacitet;
	}
	
	public boolean jePrazan() {
		if(velicina == 0) return true;
		else return false;
	}
	
	public boolean jePun() {
		if(velicina == kapacitet) return true;
		else return false;
	}
	
	public void dodaj(int vrijednost) {
		if(jePun()) {
			System.out.println("Red je pun");
			return;
		}
		rear = rear + 1;
		elementi[rear] = vrijednost;
		velicina++;
	}
	
	public int ukloni() {
		if(jePrazan()) {
			System.out.println("Red je prazan");
			return -1;
		}
		int v = elementi[0];
		for(int i = 1; i < velicina; i++) {
			elementi[i-1] = elementi[i];
		}
		velicina--;
		rear--;
		return v;
	}
	
	public int peek() {
		if(jePrazan()) {
			System.out.println("Red je prazan");
			return -1;
		}
		return elementi[0];
	}
	
	public void prikazi() {
		if(jePrazan()) {
			System.out.println("Red je prazan");
			return;
		}
		
		for(int i = 0; i < velicina; i++) {
			System.out.print(elementi[i] + " ");
		}
		System.out.println();
		
	}
	
}
