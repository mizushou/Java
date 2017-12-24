package foundation_5;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Bob";
		p1.age = 20;
		p1.income = 11000f;
		System.out.println("Name is " + p1.name);
		System.out.println("Age is " + p1.age);
		System.out.println("Income is " + p1.income);
	}
}
