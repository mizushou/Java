package foundation_2;

public class Practice_2_7_2 {
	public static void main(String[] args) {
		String strOctal = "27";   // octal representation
		String strHex = "27";     // hexadecimal representation
		String strDecimal = "27"; // decimal representation
		short o = Short.parseShort(strOctal, 8);     // 27 → 23   convert from octal to decimal.
		short h = Short.parseShort(strHex, 16);      // 27 → 39   convert from hexadecimal to decimal.
		short d = Short.parseShort(strDecimal, 10);  // 27 → 27   convert from decimal to decimal.
		System.out.println(o); // 23
		System.out.println(h); // 39
		System.out.println(d); // 27
		int sum = o + h + d;
		System.out.println("This sum is " + sum); // 89
	}
}
