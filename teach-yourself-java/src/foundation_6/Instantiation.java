package foundation_6;

class Instantiation {
	public static void main(String[] args) {
		N n = new N(12.4f, "abc", 8.7d);
		System.out.println(n.f);
		System.out.println(n.s);
		System.out.println(n.d);
	}
}
