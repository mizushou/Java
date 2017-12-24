package gists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo4 {
	public static void main(String[] args) {
		String fileDir = "/Users/shouhei/Java/atcoder/src/gists/";
		File file = new File(fileDir + "test.txt");
		try {
			//ファイルの中身
			//    apple grape
			//    mango orenge
			//    lemon cherry
			Scanner sc = new Scanner(file);
			String str = sc.next();
			System.out.println(str); // apple   単語一つしか読み込まれない.
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
