package bc74;

public class CollectingBalls {
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		int sum = 0;
		for(int i = 0; i < args.length - 2; i++) {
			int la = Math.abs(Integer.parseInt(args[i + 2]));
			int lb = Math.abs(Integer.parseInt(args[i + 2]) - k);
			if(la - lb > 0) {
				sum += lb * 2 ;
			} else {
				sum += la * 2;
			}
		}
		System.out.println(sum);
	}
}
