package aoj;

class FindMaximum {

	static int findMaximum(int[] A, int l, int r) {
		int m = (l+r)/2;
		if(l==r-1) {
			return A[l];
		} else {
			int u = findMaximum(A, l, m);
			int v = findMaximum(A, m, r);
			int x = Math.max(u, v);
			return x;
		}
	}

	public static void main(String[] args) {
		int[] A = {10, 20, 70, 10, 60, 99, 20, 30, 40, 70, 90, 80};
		System.out.println(findMaximum(A, 2, 7));
	}
}
