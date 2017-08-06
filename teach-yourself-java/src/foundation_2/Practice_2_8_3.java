package foundation_2;

public class Practice_2_8_3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println("Before : " + sb);
		sb.reverse();
		System.out.println("After : " + sb);
	}
}
