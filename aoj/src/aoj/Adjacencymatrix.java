package aoj;

import java.util.Scanner;

public class Adjacencymatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 100;
		int n = sc.nextInt();
		int[][] Adj = new int[N][N];

		// 隣接行列の初期化
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				Adj[i][j] = 0;
			};
		};

		// 隣接リスト（入力）から隣接リストへの変換
		for(int i=0; i<n; i++){
			int u = sc.nextInt();
			int k = sc.nextInt();
			u--;
			for(int j=0; j<k; j++){
				int v = sc.nextInt();
				v--;
				Adj[u][v] = 1;
			};
		};

		// 隣接行列を表示
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(Adj[i][j] + " ");
			};
			System.out.println();
		};

	}
}
