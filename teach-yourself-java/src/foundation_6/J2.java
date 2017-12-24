package foundation_6;

class J2 extends I2 {
	String getDescription() {
		String ret;
		String sup;
		sup = super.getDescription();
		ret = "This Class is J2." + "and super is " +sup;
		return ret;
	}
}
