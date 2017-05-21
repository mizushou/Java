
public class ScopeTest {
	//this is member variable[m1].
	String var = "m1";
	public static void main(String[] args) {
		ScopeTest test = new ScopeTest();
		//this is local variable[l1]　in main method.
		String var = "l1";
		System.out.println("①This var is :" + var);
		test.foo();
		System.out.println("②This var is :" + var);
		System.out.println("③This var is :" + test.var);
	}
	void foo() {
		//this is local variable[l2] in foo method.
		String var = "l2";
		bar();
		System.out.println("④This var is :" + var);
	}
	void bar() {
		//this refers 2nd line's member variable.
		var = "m1+";
	}
}
