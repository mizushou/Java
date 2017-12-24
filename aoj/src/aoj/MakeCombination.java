package aoj;

class MakeCombination {
	static int[] S;

	static void makeCombination(int n) {
		S = new int[n];
		for(int i=0; i<n-1; i++){
			S[i] = 0; //i番目をoff(選択しない).つまりこのforで一旦配列の要素すべてを0に初期化. 1 = on , 0 = off
		};
		rec(0);
	}

	private static void rec(int i) {
		int n = S.length;
		if(i == n) {
			disp(S);
			return;
		}
		rec(i+1);
		S[i] = 1; //i番目をon(選択する).
		rec(i+1);
		S[i] = 0; //i番目をoff(選択する).
	}

	static void disp(int[] S) {
		System.out.print("[ ");
		for(int i=0; i<S.length; i++){
			System.out.print(S[i]);
		};
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		makeCombination(3);
	}
}
