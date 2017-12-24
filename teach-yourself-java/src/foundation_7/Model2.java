package foundation_7;

public class Model2 extends Auto implements AntiLockBrakes, CruiseControl {

	public void antiLockBrakes() {
		System.out.println("AntiLockBrakes");
	}

	public void cruiseControl() {
		System.out.println("CruiseControl");
	}

}
