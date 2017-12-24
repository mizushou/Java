package foundation_6;

public class exeBond {
	public static void main(String[] args) {
		Bond b = new Bond();
		ConvertibleBond cb = new ConvertibleBond();
		b.display();
		cb.display();

		Bond[] bArray = new Bond[6];
		for(int i =0; i < 3; i++) {
			bArray[i] = new Bond();
			bArray[i].display();
		}

		for(int i =3; i < 6; i++) {
			bArray[i] = new ConvertibleBond();
			bArray[i].display();
		}
	}
}
