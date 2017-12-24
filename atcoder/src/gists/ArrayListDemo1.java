package gists;

import java.util.ArrayList;

class ArrayListDemo1 {
	public static void main(String[] args) {
		//1. addしてみる
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println("===========");
		System.out.println("Before add");
		System.out.println("===========");
		System.out.println("array size : " + array.size());
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		array.add(60);
		System.out.println("===========");
		System.out.println("After add");
		System.out.println("===========");
		System.out.println("array size : " + array.size());
		System.out.print("array elements :");
		showElements(array);
		System.out.println("");

		//2. index指定でaddしてみる
		System.out.println("===========");
		System.out.println("After add(i,e)");
		System.out.println("===========");
		array.add(0,1);
		System.out.println("array size : " + array.size());
		System.out.print("array elements :");
		showElements(array);
		System.out.println("");

		//3. setで置換してみる
		System.out.println("===========");
		System.out.println("After set()");
		System.out.println("===========");
		array.set(6,6);
		System.out.println("array size : " + array.size());
		System.out.print("array elements :");
		showElements(array);
		System.out.println("");
	}

	static void showElements(ArrayList a) {
		System.out.print("[ ");
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.print("]");
	}
}
