package array;

import java.util.Arrays;
import java.util.Scanner;

public class H {

	private static int[] fun(int[][] arr, double key) {
		int[] ans = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (key == arr[i][j]) {
					ans[0] = (int) key;
					ans[1] = i;
					ans[2] = j;
				}
			
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = sc.nextInt();
		System.out.println("Enter number of columns:");
		int col = sc.nextInt();
		System.out.println("Enter " + row * col + " elements for the array:");
		int[][] arr = new int[row][col];
		double maxi = -1e8;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int x = sc.nextInt();
				arr[i][j] = x;
				maxi = Math.max(maxi, x);
			}
		}
		System.out.println("Max element and its index is: " + Arrays.toString(fun(arr, maxi)));
	}
}
//DT20245743479
