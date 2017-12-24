package bc78;

import java.util.Scanner;

class Hsi2 {

	static double expectedVal(int m) {
		int n = 100000;
		double exp = Math.pow(0.5, m-1);
		for(int i=1; i<n; i++){
			exp += (i + 1) * Math.pow((1 - Math.pow(0.5, m)), i);
		};
		return exp * 0.5 * 1900 * m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = (int)Math.ceil(expectedVal(m));
		int b = (n-m) * 100;
		System.out.println(a+b);
	}
}
