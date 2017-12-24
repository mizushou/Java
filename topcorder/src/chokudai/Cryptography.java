package chokudai;

public class Cryptography {
	public long encrypt(int[] numbers) {
		long ans=0;
		for(int i=0; i<numbers.length; i++){
			long seki=1;
			for(int j=0; j<numbers.length; j++){
				if(i==j) {
					seki *= (numbers[j]+1);
				} else {
					seki *= numbers[j];
				}
			};
			ans=Math.max(ans, seki);
		};
		return ans;
	}
	public static void main(String[] args) {
		int[] numbers = {1000, 999, 998, 997, 996, 995 };
		Cryptography encryp = new Cryptography();
		System.out.println(encryp.encrypt(numbers));
	}
}
