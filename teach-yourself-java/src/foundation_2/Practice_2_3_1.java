package foundation_2;

public class Practice_2_3_1 {
	public static void main(String[] args) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		int len = a.length();
		System.out.println("Length is " + len);
		System.out.println(a.substring(len - 10, len));
	}
}
