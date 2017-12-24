package codefestival2017final;

import java.util.Scanner;


class Akihabara {

	static boolean chkakb(StringBuffer sb) {
		if(sb.toString().equals("AKIHABARA")){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		char[] arr = s.toCharArray();
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == 'A') {
				count++;
			}
		};
		System.out.println(count);
		if(count == 4){
			System.out.println(sb);
			if(chkakb(sb)){
				System.out.println("YES");
				return;
			}
		} else if(count <= 3) {
			System.out.println("hoge");
				for(int i=0; i<sb.length(); i++){
					sb.insert(i, 'A');
					System.out.println(sb);
					if(chkakb(sb)) {
						System.out.println("YES");
						break;
					} else {
						for(int j=0; j<sb.length(); j++){
							sb.insert(j, 'A');
							if(chkakb(sb)){
								System.out.println("YES");
								break;
							} else {
								sb.insert(j, 'A');
								if(chkakb(sb)){
									System.out.println("YES");
									break;
								} else {
									System.out.println("NO");
								}
							}
						}
					};
				};
		} else {
			System.out.println("NO");
		}
	}
}

