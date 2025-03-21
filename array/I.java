package array;

import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = sc.nextInt();
		System.out.println("Enter number of columns:");
		int col = sc.nextInt();
		System.out.println("Enter " + row * col + " elements for the array:");
		int[][] arr = new int[row][col];
		int sumRow=0, colSum=0;
		for (int i = 0; i < row; i++) {
			sumRow=0;
			for (int j = 0; j < col; j++) {
				int x = sc.nextInt();
				sumRow+=x;
				arr[i][j] = x;
			}
			System.out.println("Sum of "+i+"th row is: "+sumRow);
		}
		
		for (int i = 0; i < row; i++) {
			colSum=0;
			for (int j = 0; j < col; j++) {
				colSum+=arr[j][i];
			}
			System.out.println("Sum of "+i+"th col is: "+colSum);
		}
	}
}