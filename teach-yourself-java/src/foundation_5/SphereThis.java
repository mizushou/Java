package foundation_5;

public class SphereThis {
	public static void main(String[] args) {
		Sphere2 s2 = new Sphere2(100, -40, 56.5, 8);
		System.out.println("s2.r = " + s2.r);
		System.out.println("s2.x = " + s2.x);
		System.out.println("s2.y = " + s2.y);
		System.out.println("s2.z = " + s2.z);

		s2.move(0, 0, 0);
		System.out.println("sphere is moved.");
		System.out.println("s2.x = " + s2.x);
		System.out.println("s2.y = " + s2.y);
		System.out.println("s2.z = " + s2.z);

		s2.scale(1000);
		System.out.println("sphere is scaled.");
		System.out.println("s2.r = " + s2.r);
	}
}
