package foundation_2;

public class Practice_2_11_1 {
	public static void main(String[] args) {
		long cTimeMills = System.currentTimeMillis();
		System.out.println(cTimeMills + " ms");
		long cTimeMin = (cTimeMills / 1000) / 60;
		long cTimeHour = cTimeMin / 60;
		long cTimeDay = cTimeHour / 24;
		long cTimeYear = cTimeDay / 365;
		System.out.println(cTimeMin + " mins");
		System.out.println(cTimeHour + " hours");
		System.out.println(cTimeDay +  " days");
		System.out.println(cTimeYear + " years");
	}
}
