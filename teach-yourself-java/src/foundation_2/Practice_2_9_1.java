package foundation_2;

public class Practice_2_9_1 {
	public static void main(String[] args) {
		Float arr[] = new Float[5];
		System.out.println("lengsh is " + arr.length);
		for (int i =0; i < arr.length; i++) {
			arr[i] = new Float(i);
			System.out.println("element is " + arr[i]);
		}
 	}
}
