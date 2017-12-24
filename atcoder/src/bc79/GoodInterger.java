package bc79;

import java.util.Scanner;

class GoodInterger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		sc.close();
		for(int i=0; i<c.length; i++){
			int j = i;
			while(j<c.length) {
				if(c[i] != c[j]) break;
				j++;
			}
			if(j -i >=3) {
				System.out.println("Yes");
				return;
			}
		};
		System.out.println("No");
	}
}
