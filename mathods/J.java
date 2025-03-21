package mathods;

import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int count =0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println(count);
	}
}
