package foundation_5;

public class SphereOverloadMethod {
	public static void main(String[] args) {
		Sphere3 s3 = new Sphere3(100, -40, 56.5, 8);
		s3.move(-50);
		System.out.println("s3.x = " + s3.x);
		s3.move(200, 0);
		System.out.println("s3.x = " + s3.x);
		System.out.println("s3.y = " + s3.y);
	}
}
