package bc76;

import java.util.Scanner;

class RatingGoal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		System.out.println(2*g-r);
	}
}
