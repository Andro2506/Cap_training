package mathods;

import java.util.Scanner;

public class L {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count=0, x=num;
		while(x>0) {
			count++;
			x/=10;
		}
		int y=num;
		double sum=0;
		while(y>0) {
			int rem = y%10;
			sum=sum + Math.pow(rem, count);
			y/=10;
		}
		if(sum==num) {
			System.out.println(num+" is an armstrong number.");
		}
		else {
			System.out.println(num+" is not an armstrong number.");
		}
	}
}
