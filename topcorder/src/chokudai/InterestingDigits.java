package chokudai;

import java.util.ArrayList;

class InterestingDigits {
	public int[] digits(int base) {
		// 条件を満たすものの数がわからないのでリストを使用
		ArrayList <Integer> v = new ArrayList<Integer>();
		// nを決める
		for(int n=2; n<base; n++){
			boolean ok = true;
			// 1桁目. base進数なのでbase個
			for(int k1=0; k1<base; k1++){
				// 2桁目. base進数なのでbase個
				for(int k2=0; k2<base; k2++){
					// 3桁目. base進数なのでbase個
					for(int k3=0; k3<base; k3++){
						if( (k1 + k2*base + k3*base*base) % n == 0 && (k1 + k2 + k3) % n != 0) {
							// nの倍数の数で、各桁の和がnの倍数でなければ、falseでループ終了
							// このときのnは除外する
							ok = false;
							break;
						}
					}
					if( !ok ) break;
				}
				if( !ok ) break;
			}
			if( ok ) v.add(n);
		}

		int[] ans = new int [v.size()];
		for(int i=0; i<v.size(); i++) ans[i] = v.get(i);

		return ans;
	}

	public static void main(String[] args) {
		int base = 30;
		InterestingDigits dig = new InterestingDigits();
		int[] ans = dig.digits(base);
		for(int i=0; i<ans.length; i++){
			System.out.print(ans[i] + " ");
		};
	}

}
