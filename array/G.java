package array;

import java.util.Arrays;
import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = sc.nextInt();
		System.out.println("Enter number of columns:");
		int col = sc.nextInt();
		System.out.println("Enter " + row * col + " elements for the array:");
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entire array is:");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for (int[] i : arr) {
			System.out.println(Arrays.toString(i));
		}
	}
}
