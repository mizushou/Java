package codefestival2017qualc;

import java.util.Scanner;

class MakeAC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.indexOf("AC") == -1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
