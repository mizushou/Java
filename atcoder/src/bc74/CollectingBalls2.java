package bc74;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CollectingBalls2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String l1 = br.readLine();
    	String l2 = br.readLine();
		int n = Integer.parseInt(l1);
		int k = Integer.parseInt(l2);
    	String l3 = br.readLine();
    	String[] l3array = l3.split(" ");
		int sum = 0;
		for(int i = 0; i < l3array.length; i++) {
			int la = Math.abs(Integer.parseInt(l3array[i]));
			int lb = Math.abs(Integer.parseInt(l3array[i]) - k);
			if(Integer.min(la, lb) == lb) {
				sum += lb * 2 ;
			} else {
				sum += la * 2;
			}
		}
		System.out.println(sum);
	}
}
