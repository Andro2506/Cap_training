package mathods;

import java.util.Scanner;

public class K {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int evecount = 0, oddcount =0;
		int i=0;
		while(num>0) {
			i++;
			if(i%2==0) {
				evecount++;
			}
			else {
				oddcount++;
			}
			num/=10;
		}
		System.out.println((evecount*oddcount));
	}
}
