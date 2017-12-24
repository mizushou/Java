package foundation_6;

public class B757 extends Airplane {
	final static int PASSENGERS = 300;

	public B757(String serial) {
		super(serial);
	}

	@Override
	public int getPassengers() {
		return PASSENGERS;
	}
}
