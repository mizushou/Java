package gists;

import java.util.Scanner;

class ScannerDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("配列のサイズを入力してください。");
		int n = sc.nextInt();
		int[] A = new int[n];
		System.out.println("配列の要素を空白区切りで入力してください。");
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};

		System.out.print("あなたが入力した配列は : [ ");
		for(int i=0; i<A.length; i++){
			System.out.print(A[i] + " ");
		};
		System.out.println("]");
	}
}
