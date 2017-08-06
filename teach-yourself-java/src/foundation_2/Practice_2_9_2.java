package foundation_2;

public class Practice_2_9_2 {
	public static void main(String[] args) {
		Object arr[] = new Object[5];
		arr[0] = new Integer(159);
		arr[1] = new String("abc");
		arr[2] = new Boolean(true);
		arr[3] = new Character('a');
		arr[4] = new Double(0.14141356);
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
