package foundation_6;

class K2 extends J2 {
	String getDescription() {
		String ret;
		String sup;
		sup = super.getDescription();
		ret = "This Class is K2." + "and super is " +sup;
		return ret;
	}
}
