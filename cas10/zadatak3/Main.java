package zadatak3;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static Scanner unos = new Scanner(System.in);
	public static void ucitajMatricu(int m, int n, double mat[][]) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = unos.nextDouble();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = unos.nextInt();
		int n = unos.nextInt();
		int k = unos.nextInt();
		double[][] mat = new double[m][n];
		ucitajMatricu(m, n, mat);

		PriorityQueue<Osoba> pq = new PriorityQueue<>();
		
		
		
		for (int j = 0; j < n; j++) {
            double suma = 0;
            for (int i = 0; i < m; i++) {
                suma += mat[i][j];
            }
            pq.add(new Osoba(j, suma));
        }

        // uzimamo k najvećih
        for (int i = 0; i < k; i++) {
            Osoba o = pq.poll();
            System.out.print(o.id + " ");
        }
    }
	

}
