package aoj;

import java.util.Scanner;

class LinearSearch {
	static boolean search(int[] A, int n, int key) {
		int i = 0;
		//番兵法
		A[n] = key;
		while(true) {
			if(A[i] == key) {
				break;
			}
			i++;
		}
		return i == n ? false : true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[10000+1];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};
		int q = sc.nextInt();
		int sum = 0;
		long start = System.nanoTime();
		for(int i=0; i<q; i++){
			int key = sc.nextInt();
			if(search(A, n, key)) {
				sum++;
			}
		};
		long end = System.nanoTime();
		sc.close();
		System.out.println("Result : " + sum);
		System.out.println("Time : " + (end - start) / 1000000f + "ms");
	}
}
