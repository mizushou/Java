package foundation_4;

public class Practice_4_4_1 {
	public static void main(String[] args) {
		int count = 0;
		int i = 0;
		int j = 1;
		do {
			System.out.println(j + "");
			int k = i + j;
			i = j;
			j = k;
		} while(++count < 15);
		System.out.println("");
	}
}
