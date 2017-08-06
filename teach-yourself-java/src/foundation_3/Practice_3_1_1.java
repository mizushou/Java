package foundation_3;

public class Practice_3_1_1 {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]).intValue();
		if (a % 2 == 0) {
			System.out.println(a + " is even.");
		} else {
			System.out.println(a + " is odd.");
		}
	}
}
