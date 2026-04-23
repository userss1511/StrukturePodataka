package cas9;

public class Stack {

	private int[] elementi;
	private int vrh;
	private int kapacitet;
	
	
	public Stack(int kapacitet) {
		this.elementi = new int[kapacitet];
		this.vrh = -1;
		this.kapacitet = kapacitet;
	}
	
	public boolean jePrazan() {
		if(vrh == -1) return true;
		return false;
	}
	
	public boolean jePun() {
		if(this.vrh == kapacitet-1) return true;
		else return false;
		
	}
	
	public void push(int vrijednost) {
		if(jePun()) {
			System.out.println("Stek je pun!");
			return;
		}
		
		vrh = vrh + 1;
		elementi[vrh] = vrijednost;
	}
	
	public int pop() {
		if(jePrazan()) {
			System.out.println("Stek je prazan");
			return -1;
		}
		/*int br = vrh;
		vrh--;
		return elementi[br];*/
		return elementi[vrh--];
	}
	
	public int peek() {
		if(jePrazan()) {
			System.out.println("Stek je prazan");
			return -1;
		}
		return elementi[vrh];
	}
	
	public void prikazi() {
		if(jePrazan()) {
			System.out.println("Stek je prazan");
			return;
		}
		
		for(int i = vrh; i >= 0; i--) {
			System.out.print(elementi[i] + " ");
		}
		System.out.println();
	}
}
