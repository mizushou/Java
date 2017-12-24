package gists;

class LowerBound {
	static int lowerbound(int[] A, int key) {
		int high = A.length;
		int low = -1;
		while(high - low > 1) {
			int mid = (low + high)/2;
			if(A[mid] >= key) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return high;
	}

	public static void main(String[] args) {
		int[] A = {2, 3, 6, 14, 53, 159};
		System.out.println("key以上の値の位置 : " + lowerbound(A, 6));
	}
}
