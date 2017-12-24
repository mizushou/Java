package foundation_7;

public class LuminousObjects {
	private final static int NUMOBJECTS = 2;

	public static void main(String[] args) {
		LuminousObject luminousObjects[];
		luminousObjects = new LuminousObject[NUMOBJECTS];

		luminousObjects[0] = new LuminousCone();
		luminousObjects[1] = new LuminousCube();

		for(int i = 0; i < NUMOBJECTS; i++)
			luminousObjects[i].lightOn();

		for(int i= 0; i < NUMOBJECTS; i++)
			luminousObjects[i].lightOff();
	}
}
