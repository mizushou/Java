package aoj;

import java.util.Scanner;

class ExhustiveSearch {

	static int n;
	static int[] A = new int[50];

	static boolean solve(int i, int m) {
		if(m==0) {
			return true;
		}
		if(i>=n) {
			return false;
		}
		boolean res = solve(i+1, m) || solve(i+1, m-A[i]);
		return res;
	}

	public static void main(String[] args) {
		int q, M;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};
		q = sc.nextInt();
		for(int i=0; i<q; i++){
			M = sc.nextInt();
			if(solve(0, M)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		};
		sc.close();
	}


}
