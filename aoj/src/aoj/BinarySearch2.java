package aoj;

import java.util.Scanner;

class BinarySearch2 {

	static int binarySearch(int[] A, int key) {
		int left = 0;
		int right = A.length;
		while(left < right) {
			int mid = (left + right)/2;
			if(A[mid] == key) {
				return mid;
			} if(key < A[mid]) {
				right = mid;
			} else {
				left = mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};
		sc.close();
		System.out.println("keyの位置は : " + binarySearch(A, key));
	}
}
