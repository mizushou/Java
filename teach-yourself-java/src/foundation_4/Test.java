package foundation_4;

public class Test {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]).intValue();
		int b = a;
		for (int i = 1; i < b; i++) {
			a--;
		}
		System.out.print("\u0007");
	}

}
