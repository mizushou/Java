package foundation_3;

public class Practice_3_4_3 {
	public static void main(String[] args) {
		int num = Integer.valueOf(args[0]).intValue();
		for (int i = 2; i < (num / 2) +1; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}
}
