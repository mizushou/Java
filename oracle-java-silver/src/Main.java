
public class Main {

	/*
	 * this code has same name variable declaration.
	 * */

	//Declaration 1. this is static variable.
	static int i;

	public static void main(String[] args) {
		//Declaration 2. this is local variable.
		int i = 10;
		i = set(i);
		i = get();
		println();
	}
	//Declaration 3. this is argument.
	static int set(int i) {
		i = i;
		return i++;
	}
	static int get() {
		return i++;
	}
	static void println() {
		System.out.println(i);
	}
}
