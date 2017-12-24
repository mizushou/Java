package gists;

import java.util.Scanner;

public class ScannerDemo3 {
	public static void main(String[] args) {
		System.out.println("文字列を入力してください");
		//a,b,c
		//a, b, c
		//a , b , c
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s*,\\s*|\n");
		String str = sc.next();
		System.out.println("1つ目のトークンは：" + str); //a
		str = sc.next();
		System.out.println("2つ目のトークンは：" + str); //d
		str = sc.next();
		System.out.println("3つ目のトークンは：" + str); //g
		str = sc.next();
		sc.close();
	}
}
