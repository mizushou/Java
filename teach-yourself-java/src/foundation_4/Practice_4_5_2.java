package foundation_4;

public class Practice_4_5_2 {
	public static void main(String[] args) {
		for(int i = 100; i <= 200; i++) {
			boolean prime = true;
			for(int j = 2; j < i; j++) {
				int mod = i % j;
				if(mod == 0) {
					prime = false;
				}
			}
			if(prime == true) {
				System.out.print(i + " ");
			}
		}
	}
}
