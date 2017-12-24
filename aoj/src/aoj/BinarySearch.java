package aoj;

import java.util.Scanner;

class BinarySearch {

	static boolean binarySearch(int[] A, int key) {
		int left = 0;
		int right = A.length;
		while(left < right) {
			int mid = (left + right)/2;
			if(A[mid] == key) {
				return true;
			} if(key < A[mid]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};
		int q = sc.nextInt();
		int count = 0;
		for(int i=0; i<q; i++){
			if(binarySearch(A, sc.nextInt())){
				count++;
			}
		};
		sc.close();
		System.out.println(count);
	}
}
