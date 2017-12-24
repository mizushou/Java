package foundation_6;

class Foo {
	static int i = 7;
	int j;

	Foo(int j) {
		this.j = j;
	}

	public String toString() {
		return "Foo: i = " + i + "; j = " + j;
	}
}
