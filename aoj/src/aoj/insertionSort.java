package aoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class insertionSort {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String l1 = br.readLine();
		int n = Integer.parseInt(l1);
    	String l2 = br.readLine();
    	String[] a = l2.split(" ");
    	System.out.println(n);
    	int[] A = new int[n];
    	System.out.print("ソート前：");
    	for(int i = 0; i < a.length; i++) {
    		System.out.print(a[i]);
    		A[i] = Integer.parseInt(a[i]);
    	}
		System.out.println();
		//挿入ソートロジック
    	for(int i = 1; i < n; i++) {  //未ソートの部分列の先頭を示すループ変数
    		int v = A[i];             //A[i]の値を一時的に保持しておくための変数
    		int j = i - 1;            //ソート済み部分列からvを挿入するための位置を探すためループ変数
    		while(j >= 0 && A[j] > v) {
    			A[j+1] = A[j]; //横に一個づつずらす
    			j--;
    		}
    		System.out.println(j);
    		A[j + 1] = v; //挿入
    	}

    	System.out.print("ソート後：");
    	for(int i = 0; i < A.length; i++) {
    		System.out.print(A[i]);
    	}
 	}
}
