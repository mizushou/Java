package foundation_6;

class AbstractClassDemo {
	public static void main(String[] args) {
		Shape s = new Trapezoid();
		s.display();
		s = new Rhombus();
		s.display();
	}
}
