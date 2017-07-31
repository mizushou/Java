package foundation_1;

public class practice_1_16_3 {
	public static void main(String[] args) {
		byte a[][][];
		a = new byte[3][3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					a[i][j][k] = 1;
					if(j == 2 && k == 2) {
						System.out.println("[" + i + "]" + "[" + j + "]" +"[" + k + "] : " + a[i][j][k]);
					} else {
						System.out.print("[" + i + "]" + "[" + j + "]" +"[" + k + "] : " + a[i][j][k] + " , ");
					}
				}
			}
		}
	}

}
