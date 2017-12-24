package chokudai;

public class ThePalindrome {
	public int find(String s) {
		// 答えの文字数を決定する. 条件は指定しない(無限ループ. returnでの強制終了)
		for(int i=s.length(); ;i++){
			boolean flag = true;
			for(int j=0; j<s.length(); j++){
				if ((i - j - 1) < s.length() && s.charAt(j) != s.charAt(i - j - 1)){
					flag = false;
					break;
				}
			};
			if(flag) return i;
		}
	}

	public static void main(String[] args) {
		ThePalindrome p = new ThePalindrome();
		System.out.println(p.find("abdfhdyrbdbsdfghjkllkjhgfds"));
	}
}
