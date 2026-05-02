package zadatak1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void ucitajMatricu(int m, int n, int mat[][]) {
		Scanner unos = new Scanner(System.in);
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = unos.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		//int m = unos.nextInt();
		int n = unos.nextInt();
		int[][] mat = new int[n][n];
		ucitajMatricu(n, n, mat);
		
		Point start = null, end = null;

        // trazenje pocetne i krajnje pozicije
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) start = new Point(i, j);
                if (mat[i][j] == 2) end = new Point(i, j);
            }
        }

        if (start == null || end == null) {
            System.out.println("Ne postoji");
            return;
        }
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        boolean[][] visited = new boolean[n][n];
        Queue<Point> red = new LinkedList<>();

        red.add(start);
        visited[start.x][start.y] = true;

        boolean postoji = false;

        while (!red.isEmpty()) {
            Point p = red.poll();

            if (p.x == end.x && p.y == end.y) {
                postoji = true;
                break;
            }

            for (int i = 0; i < 8; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (!visited[nx][ny] && mat[nx][ny] != 0) {
                        visited[nx][ny] = true;
                        red.add(new Point(nx, ny));
                    }
                }
            }
        }

        if (postoji) System.out.println("Postoji");
        else System.out.println("Ne postoji");
    }	
	
}
