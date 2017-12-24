package foundation_4;

public class Practice_4_3_1 {
	public static void main(String[] args) {
		int l = args.length;
		int sum = 0;
		for(int i = 0; i < l; i++) {
			sum = sum + Integer.valueOf(args[i]).intValue();
		}
		System.out.println(sum);
	}
}
