package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Stack2 {
	static ArrayList<Integer> S = new ArrayList<Integer>();
	static int top = 0;

	static void push(int x) {
		try {
			isFull();
		} catch (Exception e) {
			e.printStackTrace();
		}
		top++;
		System.out.println(S.size());
		S.add(top,x);
		System.out.println(S.get(top - 1));
	};

	static int pop() {
		try {
			isEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
		top--;
		return S.get(top);
	};

	static void initialize() {
		top = 0;
	}

	static void isEmpty() throws Exception {
		if(top == 0) {
		}
	}

	static void isFull() throws Exception {
		if(top >= S.size()) {
		}
	}

	public static void main(String[] args) throws IOException {
		//S.add(top,null);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = br.readLine();
		String[] s = l.split(" ");
		int a,b;
		for(int i = 0; i < s.length; i++) {
			System.out.println("------------------");
			System.out.println("i :" + i);
			System.out.println("top :" + top);
			System.out.println("------------------");
			if(s[i].equals("+")){
				System.out.println("before pop1 top is:" + top);
				a = pop();
				System.out.println("before pop2 top is:" + top);
				b = pop();
				System.out.println("a:" + a);
				System.out.println("b:" + b);
				push(a + b);
			}else if(s[i].equals("-")) {
				a = pop();
				b = pop();
				push(a - b);
			}else if(s[i].equals("*")) {
				a = pop();
				b = pop();
				push(a * b);
			}else {
				System.out.println("hoge");
				push(Integer.parseInt(s[i]));
			}
		}
		System.out.println(pop());
	};
}
