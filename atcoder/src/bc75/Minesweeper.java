package bc75;

import java.util.Scanner;

class Minesweeper {

	static boolean chk(int i, int j, int h, int w, int k) {
		boolean flag = true;
		if(i-1<0 || i+1>h || j-1<0 || j+1>w){
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for(int i=0; i<h; i++){
			s[i] = sc.next();
		};
		sc.close();
		for(int i=0; i<h; i++){
			int count = 0;
			for(int j=0; j<w; j++){
				for(int k=0; k<8; j++){
					boolean flag;
					flag = chk(i,j,h,w,k);
					if(flag == true) {
						if(s[i-1+k].charAt(j-1+k) == '#') {
							count++;
						}
					}
				};
				System.out.println("count : " + count);
				s[i].replaceFirst(".",String.valueOf(count));
			};
		};
	}
}
