package foundation_6;

abstract class Fruit {
	String color;

	public String toString(){
		return getClass().getName() + ":" + color;
	}
}
