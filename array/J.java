package array;

import java.util.Arrays;
import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size:");
		int row = sc.nextInt();
		System.out.println("Enter the column size:");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter the "+row*col+" elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Before transposing:");
		for(int[] i:arr) {
			System.out.println(Arrays.toString(i));
		}
		for(int i=0;i<row;i++) {
			for(int j=i+1;j<=col/2;j++) {
				if(i!=j) {
					int temp = arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		System.out.println("After transposing:");
		for(int[] i:arr) {
			System.out.println(Arrays.toString(i));
		}
		
	}

}
