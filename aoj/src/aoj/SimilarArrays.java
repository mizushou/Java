package aoj;

import java.util.Scanner;

public class SimilarArrays {

	static int[] A = new int[20];
	static int n;

	static void makeCombination() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};
		rec(0);
	}

	static void rec(int i) {
		if(i==n) {
			disp(A);
			return;
		}
		rec(i+1);
		A[i] = A[i]+1;
		rec(i+1);
		A[i] = A[i];
		rec(i+1);
		A[i] = A[i]-1;
	}

	static void disp(int[] S) {
		System.out.print("[ ");
		for(int i=0; i<S.length; i++){
			System.out.print(S[i]);
		};
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		makeCombination();
	}

}
