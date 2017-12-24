package aoj;

import java.util.ArrayList;

class Combination {

	static ArrayList<Integer> alist = new ArrayList<>();
	static int[] a = {1,2};

	static void combination(int i, int r) {
		if(r==0) {
			System.out.print("combi : ");
			showElements(alist);
		} else {
			for(int j=i; j<a.length; j++) {
				 alist.add(a[j]);
				 combination(i+1, r-1);
				 alist.add(a[j]);
				 combination(i+1, r);
//				 alist.remove(i);
//				 showElements(alist);
			};
		}
	};

	static void showElements(ArrayList<Integer> a) {
		System.out.print("[ ");
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println("]");
	}


	public static void main(String[] args) {
		combination(0, 2);
	}
}
