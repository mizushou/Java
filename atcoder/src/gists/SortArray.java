package gists;

import java.util.Arrays;

class SortArray {
	public static void main(String[] args) {
		int[] A = {3, 1, 4, 2, 5};
		Arrays.sort(A);
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]); //12345  昇順でソート
		};
	}
}
