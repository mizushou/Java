package foundation_5;

public class SpanishTranlator {
	static String translate(String eng) {
		String spn;
		eng = eng.toLowerCase();
		System.out.println(eng);
		if (eng.equals("one"))
			spn = "Uno";
		else if (eng.equals("two"))
			spn = "Dos";
		else if (eng.equals("three"))
			spn = "Tres";
		else if (eng.equals("four"))
			spn = "Quatro";
		else if (eng.equals("five"))
			spn = "Cinco";
		else
			spn = "Unknown";
		return spn;
	}
}
