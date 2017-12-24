package aoj;

class Fibonacci {
	static int fib(int n) {
		//引数でn=0,1を指定した際は再帰処理を行わず、即座に1を返す
		if(n<=1) return 1;
		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fib(0));
	}
}
