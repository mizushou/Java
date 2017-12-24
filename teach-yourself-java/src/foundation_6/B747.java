package foundation_6;

public class B747 extends Airplane {
	final static int PASSENGERS = 500;

	public B747(String serial) {
		super(serial);
	}

	@Override
	public int getPassengers() {
		return PASSENGERS;
	}
}
