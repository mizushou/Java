package foundation_5;

public class SphereMethods {
	public static void main(String[] args) {
		Sphere2 s2 = new Sphere2(1.1, 3.4, -9.8, 10);
		s2.move(-40, -40, -40);
		s2.scale(0.1);
		System.out.println("s2.x = " + s2.x);
		System.out.println("s2.y = " + s2.y);
		System.out.println("s2.z = " + s2.z);
		System.out.println("s2.r = " + s2.r);
	}
}
