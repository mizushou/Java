package foundation_4;

public class Practice_4_2_1 {
	public static void main(String[] args) {
		int i = Integer.valueOf(args[0]).intValue();
		for (int j = i; j > 0; j--) {
			System.out.println(j);
		}
		System.out.print("\u0007");
		System.out.println("");
	}

}
