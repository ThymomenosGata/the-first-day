package mas2ToMas1;

import java.util.Scanner;

public class main {
	
	public static int[] masToMas(int[][] masT, int n, int m){
		int[] mas = new int[n*m];
		int k=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				mas[k]=masT[i][j];
				k++;
			}
		}
		return mas;
	}
	public static void main(String[] args) {
		int n,m;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		int[][] masT = new int[n][m];
		int[] mas;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				masT[i][j]=scanner.nextInt();
			}
		}
		mas = masToMas(masT,n,m);
		for(int i=0;i<n*m;i++){
			System.out.print(mas[i]);
		}
	}
}
