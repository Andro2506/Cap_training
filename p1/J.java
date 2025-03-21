package p1;

import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = sc.nextDouble();
		if(num>=0) {
			System.out.println(num+" is a positive number!");
			if(num%2==0) {
				System.out.println(num+" is an even number as well!");
			}
			else {
				System.out.println(num+" is an odd number as well!");
			}
		}
		else {
			System.out.println(num+" is a negative number!");
			if(num%2==0) {
				System.out.println(num+" is an even number as well!");
			}
			else {
				System.out.println(num+" is an odd number as well!");
			}
		}
		sc.close();
	}
}
