package bc78;

import java.util.Scanner;

public class Hex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		if (x.compareTo(y) < 0) {
			System.out.println("<");
		} else if (x.compareTo(y) > 0) {
			System.out.println(">");
		} else {
			System.out.println("=");
		}
	}
}
