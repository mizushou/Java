package bc76;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionAndMultiplication {

	static int i = 1;
	static ArrayList<Integer> A = new ArrayList<>();

	static void func(int n, int k) {
		if(n==0) {
			A.add(i);
			System.out.println(i);
		} else {
			func(n-1,k);
			i = i * 2;
			func(n-1,k);
			i = i + k;
		}
	}

	static int minElements(ArrayList<Integer> a) {
		int min = A.get(3);
		for(int i = 0; i < a.size(); i++) {
			int v = a.get(i);
			if(v<min) {
				min = v;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		func(n, k);
		System.out.println(minElements(A));
	}
}
