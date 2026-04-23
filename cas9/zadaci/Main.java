package zadaci;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	
	//{}
	//({})[]
	//()[]}
	//(}
	//(()()(())
	
	public static boolean zagrade(String izraz) {
		Stack<Character> s = new Stack<Character>();
		
		for(int i = 0; i < izraz.length(); i++) {
			char c = izraz.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				s.push(c);
			}
			else {
				if(s.empty()) return false;
				if(c == ')' && s.peek() != '(') return false;
				if(c == '}' && s.peek() != '{') return false;
				if(c == ']' && s.peek() != '[') return false;
				s.pop();
			}
		}
		if(!s.empty()) return false;
		return true;
	}

	
	public static int djelilac(int n) {
		Queue<Integer> red = new LinkedList<Integer>();
		red.offer(1);
		
		while(red.peek() % n != 0) {
			int broj = red.poll();
			int broj1 = broj*10;
			int broj2 = broj*10 + 1;
			red.offer(broj1);
			red.offer(broj2);
		}
		
		return red.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Stack<Integer> s = new Stack<Integer>();
		System.out.println(s.empty());
		s.push(1);
		s.push(2);
		System.out.println(s.empty());
		//System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.empty());*/
		//System.out.println(zagrade("()()(()))"));
		
		/*Queue<Integer> red = new LinkedList<Integer>();
		System.out.println(red.isEmpty());
		red.offer(1);
		red.offer(2);
		System.out.println(red.isEmpty());
		System.out.println(red.peek());
		System.out.println(red.poll());
		System.out.println(red.poll());
		System.out.println(red.isEmpty());*/
		System.out.println(djelilac(4));
	
	}

}
