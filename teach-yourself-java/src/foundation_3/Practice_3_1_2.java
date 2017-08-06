package foundation_3;

public class Practice_3_1_2 {
	public static void main(String[] args) {
		double d = Double.valueOf(args[0]).doubleValue();
		String unit = args[1];
		if (unit.equalsIgnoreCase("feet")) {
			System.out.println(d + " feet = " + d / 3.28 + " meters");
		} if (unit.equalsIgnoreCase("meters")) {
			System.out.println(d + " meters = " + d * 3.28 + " feet");
		} else {
			System.out.println("Could not recognize such the unit");
		}
	}
}
