package foundation_6;

public abstract class B767 extends Airplane {
	final static int PASSENGERS = 400;

	public B767(String serial) {
		super(serial);
	}

	@Override
	public int getPassengers() {
		return PASSENGERS;
	}
}
