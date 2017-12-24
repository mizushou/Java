package foundation_5;

public class Circle {
	double x;
	double y;
	double r;

	Circle(double ar) {
		r = ar;
		x = 0;
		y = 0;
	}
	Circle(double ax, double ay, double ar) {
		r = ar;
		x = ax;
		y = ay;
	}
}
