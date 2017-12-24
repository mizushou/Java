package foundation_6;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Class c = i.getClass();
		Class sc = c.getSuperclass();
		System.out.println(sc.getName());
	}
}
