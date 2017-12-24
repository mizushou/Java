package gists;

class UpperBound {
	static int upperbound(int[] A, int key) {
		int high = A.length;
		int low = -1;
		while(high - low > 1) {
			int mid = (low + high)/2;
			if(A[mid] > key) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return high;
	}

	public static void main(String[] args) {
		int[] A = {2, 3, 6, 14, 53, 159};
		System.out.println("keyより大きい値の位置 : " + upperbound(A, 6));
	}
}
