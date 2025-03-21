package p1;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(num1 + "\t*\t" + i + "\t=\t" + (num1 * i));
//		}
		int sum = 0;
		for (int i = Math.min(num1, num2); i <= Math.max(num2, num1); i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}