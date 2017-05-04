
public class ScopeTest {
	//this is member variable.
	int num;
	public static void main(String[] args) {
		ScopeTest test = new ScopeTest();
		//this is local variable.
		int num = 0;
		System.out.print(num);
		test.foo();
		System.out.print(num);
		System.out.print(test.num);
	}
	void foo() {
		//this is local variable.
		int num = 1;
		bar();
		System.out.print(num);
	}
	void bar() {
		//this is member variable.
		num = 2;
	}
}
