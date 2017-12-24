package gists;

import java.util.Scanner;

public class ScannerDemo1 {
	public static void main(String[] args) {
		System.out.println("文字を入力してください");
		//abc def ghi
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("1つ目のトークンは：" + str); //abc
		str = sc.next();
		System.out.println("2つ目のトークンは：" + str); //def
		str = sc.next();
		System.out.println("3つ目のトークンは：" + str); //ghi
		str = sc.next();
		sc.close();
	}
}
