package aoj;

class Permutation {
	int mData[];

	public Permutation(int[] data) {
		mData = data;
	}

	public void perm() {
		_perm(0);
	}

	private void _perm(int i) {
		if (i == mData.length) {
			eval();
		} else {
			for(int j=i; j<mData.length; j++){
				swap(i,j);
				_perm(i+1);
				swap(i,j);
			};
		}
	}

	private void swap(int i, int j) {
		int temp = mData[i];
		mData[i] = mData[j];
		mData[j] = temp;
	}

	public void eval() {
		String str = "";
		for(int i=0; i<mData.length; i++){
			str += mData[i] + "";
		};
		System.out.println(str);
	}

	static void disp(int[] S) {
		System.out.print("[ ");
		for(int i=0; i<S.length; i++){
			System.out.print(S[i]);
		};
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		int[] data = {1, 2, 3};
		Permutation p = new Permutation(data);
		p.perm();
	}

}
