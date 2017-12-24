
public class StringBuilderPractice {
	public static void main(String[] args) {
		//------------------------------------------------
		// 1. use constructors.
		//------------------------------------------------
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Thankyou");
		StringBuilder sb3 = new StringBuilder(64);

		System.out.println(sb1.capacity()); // 16:default capacity
		System.out.println(sb2.capacity()); // 24:default capacity + string capacity
		System.out.println(sb3.capacity()); // 64:assigned capacity
		System.out.println(sb1.length());   // 0
		System.out.println(sb2.length());   // 8
		System.out.println(sb3.length());   // 0

		//------------------------------------------------
		// 2. use append
		//------------------------------------------------
		sb1.append("Thank").append("you");
		System.out.println(sb1.toString());
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());

		//
		// 3. compare String's toString	with StringBuilder's toString.
		//
		String msg = "Thankyou";
		if(msg == sb1.toString()) {
			System.out.println("Same Object");
		}
		if(sb1.equals(msg.toString())) {
			System.out.println("Same String");
		}
		//
		// 4. use delete and replace.
		//
		StringBuilder sb4 = new StringBuilder("123456789");
		sb4.delete(0,3);
		System.out.println(sb4);
		sb4.delete(1,2);
		System.out.println(sb4);
		sb4.replace(2,4,"4");
		System.out.println(sb4);
		//
		// 5. use insert
		//
		StringBuilder sb5 = new StringBuilder("Ihappy.");
		sb5.insert(1, " am ");
		System.out.println(sb5.toString());
	}

}
