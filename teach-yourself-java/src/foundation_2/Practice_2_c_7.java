package foundation_2;

public class Practice_2_c_7 {
	public static void main(String[] args) {
		double degree = Double.valueOf(args[0]).doubleValue();
		//convert from degree to radian.
		double radian = degree * Math.PI /180;
		System.out.println("con = " + Math.cos(radian));
		System.out.println("sin = " + Math.sin(radian));
		System.out.println("tan = " + Math.tan(radian));
	}
}
