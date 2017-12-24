package foundation_5;

public class Sphere3 {
	double r;
	double x;
	double y;
	double z;

	Sphere3() {
		this(0, 0, 0, 1);
	}

	Sphere3(double r) {
		this(0, 0, 0, r);
	}

	Sphere3(double x, double y, double z, double r) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
	}

	void move(double x) {
		this.x = x;
	}

	void move(double x, double y) {
		this.x = x;
		this.y = y;
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
