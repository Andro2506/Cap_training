package array;


import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[5];
		System.out.print("Enter elements in the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		for(double t: arr) {
			System.out.print(t+" ");
		}
		
	}
}
