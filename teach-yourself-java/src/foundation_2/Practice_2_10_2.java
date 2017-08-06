package foundation_2;

public class Practice_2_10_2 {
	public static void main(String[] args) {
		double pi = Math.PI;
		double r =  Double.valueOf(args[0]).doubleValue();
		double area = pi * r * r;
		System.out.println(area);
	}
}
