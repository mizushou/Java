package foundation_7;

public class InstanceofTest {
	public static void main(String args[]) {
		W w = new W();
		if(w instanceof I1)
			w.display1();
		if(w instanceof I2)
			w.display2();
		if(w instanceof I3)
			w.display3();
		if(w instanceof I4)
			w.display4();
		if(w instanceof W)
			w.display4();
		if(w instanceof X)
			w.x();
	}
}
