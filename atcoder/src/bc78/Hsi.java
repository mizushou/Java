package bc78;

import java.util.Scanner;

class Hsi {

	static float expectedVal() {
		int n = 100000;
		float exp = 0;
		for(int i=1; i<n; i++){
			exp += i * Math.pow(0.5, i);
		};
		return exp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 1900 * m * (int)Math.ceil(expectedVal());
		int b = (n-m) * 100;
		System.out.println(a+b);
	}
}
