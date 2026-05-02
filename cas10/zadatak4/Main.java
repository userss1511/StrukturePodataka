package zadatak4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int izbroj(String tekst, String genom) {
		int start = 0;
		int ind = genom.indexOf(tekst, start);
		int brojac = 0;
		while(ind != -1) {
			brojac++;
			start = ind + 1;
			ind = genom.indexOf(tekst, start);
		}
		return brojac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner unos = new Scanner(System.in);

	        String genom = unos.next();
	        int k = unos.nextInt();
	        int n = unos.nextInt();

	        HashMap<String, Boolean> hm = new HashMap<>();
	        PriorityQueue<Sekvenca> pq = new PriorityQueue<Sekvenca>();
	        
	        for(int i = 0; i <= genom.length() - n; i++) {
	        	String tekst = genom.substring(i, i+n);
	        	int brojPojavljivanja = izbroj(tekst, genom);
	        	if(!hm.containsKey(tekst)) {
	        		pq.offer(new Sekvenca(tekst, brojPojavljivanja));
	        		hm.put(tekst, true);
	        		
	        	}
	        	
	        }
	        
	        while(k > 0) {
	        	System.out.println(pq.poll().tekst);
	        	k--;
	        }
	        
	        

	}

}
