package foundation_1;

public class practice_1_16_1 {
	public static void main(String[] args) {

//		float a[][];
//		a = new float[3][3];
//		a[0][0] = -56.7f;
//		a[1][0] = 500.1f;
//		a[1][1] = 70.70f;
//		a[2][0] = 100.9f;
//		a[2][1] = 0.5f;
//		a[2][2] = 20.20f;

	    float a[][] = {
	    	      { -56.7f },
	    	      { 500.1f, 70.70f },
	    	      { 100.9f, 0.5f, 20.20f }
	    	    };

	    // display element count
		System.out.println("array length is " +  a.length);
		System.out.println("array length is " +  a[0].length);
		System.out.println("array length is " +  a[1].length);
		System.out.println("array length is " +  a[2].length);
		// display element
		System.out.println("[0][0] : " + a[0][0]);
		System.out.println("[1][0] : " + a[1][0]);
		System.out.println("[1][1] : " + a[1][1]);
		System.out.println("[2][0] : " + a[2][0]);
		System.out.println("[2][1] : " + a[2][1]);
		System.out.println("[2][2] : " + a[2][2]);
	}

}
