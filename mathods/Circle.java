package mathods;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = new String();
		System.out.println("Enter a word");
		char ch = sc.next().charAt(0);
		System.out.println("Word[0]: "+ch);
		sc.nextLine();
		System.out.println("Enter a semtence");
		st = sc.nextLine();
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println(st + " "+a);
		sc.close();
		}
}
