package foundation_6;

abstract class Airplane {
	String serial;

	public Airplane(String serial) {
		this.serial = serial;
	}

	abstract int getPassengers();

	public String toString() {
		Class cls = getClass();
		return cls.getName() + ": " + serial + " " + getPassengers();
	}
}
