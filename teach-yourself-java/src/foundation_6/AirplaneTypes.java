package foundation_6;

class AirplaneTypes {
	static int NUMAIROANES = 6;

	public static void main(String[] args) {

		Airplane airplanes[] = new Airplane[NUMAIROANES];

		airplanes[0] = new B747("UA1233");
		airplanes[1] = new B747("UA8793");
		airplanes[2] = new B747("UA6733");
		airplanes[3] = new B747("UA4523");
		airplanes[4] = new B747("UA9772");
		airplanes[5] = new B747("UA2331");

		for(int i = 0; i < NUMAIROANES; i++) {
			Airplane a = airplanes[i];
			System.out.println(a);
		}
	}
}
