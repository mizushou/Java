
class AryTest {
	public static void main(String[] args) {
		char[] ary = {'a', 'b', 'c', 'd', 'e', 'f'};
		System.arraycopy(ary, 3, ary, 1, 2);
		for(int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]);
		}
	}
}
