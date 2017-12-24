package gists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo5 {
	public static void main(String[] args) {
		try {
			//ファイルの中身
			// apple grape
			// mango orenge
			// lemon cherry
			String fileDir = "/Users/shouhei/Java/atcoder/src/gists/";
			File file = new File(fileDir + "test.txt");
			Scanner sc = new Scanner(file);
			sc.useDelimiter("\\n"); //区切り文字を改行に変更.(Unix) これをしないとデフォルトの空白で区切られてしまうので、単語ごとに出力されてしまう.

			int line = 1;
			while(sc.hasNext()) {
				String str = sc.next();
				System.out.println(line + ":" + str);
				line++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
