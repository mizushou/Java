package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Stack {
	private static int N = 1000;
	static int[] array = new int[N];
	static int top = 0;

	static void push(int x) {
		try {
			isFull();
		} catch (Exception e) {
			e.printStackTrace();
		}
		top++;
		array[top] = x;
	};

	static int pop() {
		try {
			isEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
		top--;
		return array[top + 1];
	};

	static void initialize() {
		top = 0;
	}

	static void isEmpty() throws Exception {
		if(top == 0) {
		}
	}

	static void isFull() throws Exception {
		if(top >= array.length) {
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = br.readLine();
		String[] s = l.split(" ");
		int a,b;
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("+")){
				a = pop();
				b = pop();
				push(a + b);
			}else if(s[i].equals("-")) {
				b = pop();
				a = pop();
				push(a - b);
			}else if(s[i].equals("*")) {
				a = pop();
				b = pop();
				push(a * b);
			}else {
				push(Integer.parseInt(s[i]));
			}
		}
		System.out.println("result : " + pop());
	};
}
