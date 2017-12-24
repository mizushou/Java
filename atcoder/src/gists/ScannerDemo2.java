package gists;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力してください");

		try {
			// 12 34 56
			int n = sc.nextInt();
			System.out.println("１つめの整数：" + n);
			n = sc.nextInt();
			System.out.println("2つめの整数：" + n);
			n = sc.nextInt();
			System.out.println("3つめの整数：" + n);
		} catch(InputMismatchException e) {
			System.out.println("型が違います" + e);
		}
		sc.close();
	}
}
