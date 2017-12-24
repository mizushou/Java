package bc77;

import java.util.Arrays;
import java.util.Scanner;

class SunukeFestival {

	static int lowerbound(int[] A, int key) {
		int high = A.length;
		int low = -1;
		while(high - low > 1) {
			int mid = (low + high)/2;
			if(A[mid] >= key) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return high;
	}

	static int upperbound(int[] A, int key) {
		int high = A.length;
		int low = -1;
		while(high - low > 1) {
			int mid = (low + high)/2;
			if(A[mid] > key) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return high;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};

		int[] B = new int[n];
		for(int i=0; i<n; i++){
			B[i] = sc.nextInt();
		};

		int[] C = new int[n];
		for(int i=0; i<n; i++){
			C[i] = sc.nextInt();
		};
		sc.close();

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		System.out.print("あなたが入力した配列は : [ ");
		for(int i=0; i<A.length; i++){
			System.out.print(A[i] + " ");
		};
		System.out.println("]");
		System.out.print("あなたが入力した配列は : [ ");
		for(int i=0; i<B.length; i++){
			System.out.print(B[i] + " ");
		};
		System.out.println("]");
		System.out.print("あなたが入力した配列は : [ ");
		for(int i=0; i<C.length; i++){
			System.out.print(C[i] + " ");
		};
		System.out.println("]");


		long count = 0;
		for(int i=0; i<n; i++){
			int x = lowerbound(A, B[i]);
			int y = n - upperbound(C, B[i]);
			System.out.println("i : " + i);
			System.out.println("x : " + x );
			System.out.println("y : " + y );
			count += (long) x * y;
		};
		System.out.println(count);
	}
}
