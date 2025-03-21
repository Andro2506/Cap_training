package mathods;

import java.util.Scanner;

public class N {
	public static boolean checkPalindrome(int x) {
		int count=0,y=x;
		int rev=0;
		while(y>0) {
			int rem=y%10;
			rev = rev*10 + rem;
			y/=10;
		}
		if(rev==x) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(checkPalindrome(num));
	}
}
