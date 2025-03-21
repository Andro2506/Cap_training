package mathods;

import java.util.Scanner;

public class O {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range for fibonacci series: ");
		int num = sc.nextInt();
		int prev=0, curr=1, next=prev+curr;
		System.out.print(prev+" ");
		System.out.print(curr+" ");
		System.out.print(next+" ");
		while(num>3) {
			prev=curr;
			curr=next;
			next=prev+curr;
			System.out.print(next+" ");
			num--;
		}
	}
}
