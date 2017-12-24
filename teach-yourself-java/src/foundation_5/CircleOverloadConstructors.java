package foundation_5;

public class CircleOverloadConstructors {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5, 1.0, 2.0);
		System.out.println("c1.r = " + c1.r);
		System.out.println("c1.x = " + c1.x);
		System.out.println("c1.y = " + c1.y);
		System.out.println("c2.r = " + c2.r);
		System.out.println("c2.x = " + c2.x);
		System.out.println("c2.y = " + c2.y);
	}
}
