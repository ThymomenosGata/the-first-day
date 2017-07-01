package masUNDER;

import java.util.Scanner;

public class Mas {

	public static int[][] und(int[][] mas){
		int[][] undM = new int[mas.length][mas.length];
		for(int i=0;i<mas.length;i++){
			for(int j=0;j<mas.length;j++){
				undM[mas.length-1-j][i] = mas[i][j];
			}
		}
		return undM;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] mas = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mas[i][j]=scanner.nextInt();
			}
		}
		mas = und(mas);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(mas[i][j]);
			}
			System.out.println();
		}
	}

}
