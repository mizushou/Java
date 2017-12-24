package foundation_4;

public class Practice_4_6_1 {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			char ch = args[i].charAt(0);
			if(!Character.isLetter(ch) || !Character.isUpperCase(ch)) {
				System.out.println("Arguments must begin " + "with an upper case letter");
				break;
			}
		}
 	}
}
