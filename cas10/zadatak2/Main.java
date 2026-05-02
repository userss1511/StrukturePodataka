package zadatak2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static Scanner unos = new Scanner(System.in);
	public static void ucitajMatricu(int m, int n, int mat[][]) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = unos.nextInt();
			}
		}
	}

	
	 public static int najveceJezero(int[][] mapa) {
	        int m = mapa.length;
	        int n = mapa[0].length;

	        boolean[][] visited = new boolean[m][n];

	        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

	        int max = 0;

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {

	                if (mapa[i][j] == 0 && !visited[i][j]) {

	                    int count = 0;
	                    Stack<Point> stack = new Stack<>();
	                    stack.push(new Point(i, j));
	                    visited[i][j] = true;

	                    while (!stack.isEmpty()) {
	                        Point p = stack.pop();
	                        count++;

	                        for (int k = 0; k < 8; k++) {
	                            int nx = p.x + dx[k];
	                            int ny = p.y + dy[k];

	                            if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
	                                if (!visited[nx][ny] && mapa[nx][ny] == 0) {
	                                    visited[nx][ny] = true;
	                                    stack.add(new Point(nx, ny));
	                                }
	                            }
	                        }
	                    }

	                    max = Math.max(max, count);
	                }
	            }
	        }

	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = unos.nextInt();
		int n = unos.nextInt();
		int[][] mat = new int[m][n];
		ucitajMatricu(m, n, mat);
		
		System.out.println(najveceJezero(mat));

	}

}
