package foundation_6;

class Instantiation2 {
	public static void main(String[] args) {
		S s = new S(10);
		System.out.println(s.x);
		StringBuffer sb = new StringBuffer("abc");
		T t = new T(100, sb);
		System.out.println(t.x);
	}
}
