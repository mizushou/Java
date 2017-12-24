package bc76;

import java.util.Scanner;

class AdditionAndMultiplication2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int number = 1;
		for(int i=0; i<n; i++){
			if(2*number < number+k) {
				number = 2*number;
			} else {
				number = number+k;
			}
		};
		System.out.println(number);
	}
}
