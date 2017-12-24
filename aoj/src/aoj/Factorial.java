package aoj;

class Factorial {

	//階乗を求める再帰関数
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(factorial(n));
	}

}
