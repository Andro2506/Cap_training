package array;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[4];
		System.out.print("Enter names:\n");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		for (String i : arr) {
			System.out.print(i + " ");
		}
	}
}