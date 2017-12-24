package aoj;

public class MakeInt {

	static int n = 3;
	static int[] A = {1, 3, 4};

	static boolean solve(int i, int m) {

		if(m == 0) {
			return true;
		}
		if(i >= n) {
			return false;
		}
		boolean res = solve(i + 1, m) || solve(i + 1, m - A[i]);
		return res;
	}

	public static void main(String[] args) {
		System.out.println(solve(0, 8));
	}

}
