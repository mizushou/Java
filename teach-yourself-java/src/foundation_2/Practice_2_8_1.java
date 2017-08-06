package foundation_2;

public class Practice_2_8_1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);
		System.out.println("sb.capacity = " + sb.capacity());
		System.out.println("sb.length = " + sb.length());
	}
}
