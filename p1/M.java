package p1;

import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day: ");
		int day = sc.nextInt();
		day = day%7 + 1;
		switch(day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tueday");
				break;
			case 4:
				System.out.println("Wedday");
				break;
			case 5:
				System.out.println("Thuday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
		}
	}
}
