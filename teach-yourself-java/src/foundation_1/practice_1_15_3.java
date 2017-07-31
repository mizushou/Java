package foundation_1;

public class practice_1_15_3 {
	public static void main(String[] args) {
		double a[];
		a = new double[4];
		a[0] = 0.0000;
		a[1] = 1.0000;
		a[2] = 2.0000;
		a[3] = 3.0000;

		double sum = 0.0000;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println( "The average is " + (sum / 4.000));
	}
}
