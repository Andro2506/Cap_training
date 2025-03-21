package p1;

import java.util.Scanner;

public class K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter a character among +, -, *, /: ");
		char ch = sc.next().charAt(0);
		if(ch=='+') {
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
		}
		else if(ch=='-') {
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
		}
		else if(ch=='*') {
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
		}
		else if(ch=='/'){
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
		}
		else {
			System.out.println(ch+" is an invalid input!");
		}
		sc.close();
	}
}
