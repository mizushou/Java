package foundation_5;

public class Sphere2 {
	double r;
	double x;
	double y;
	double z;

	Sphere2() {
		this(0, 0, 0, 1);
	}

	Sphere2(double r) {
		this(0, 0, 0, r);
	}

	Sphere2(double x, double y, double z, double r) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
	}

	void move(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	void scale(double a) {
		this.r *= a;
	}

}
