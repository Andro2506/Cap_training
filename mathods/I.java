package mathods;

import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String s = sc.nextLine();
		Scanner sc2 = new Scanner(s);
		sc2.useDelimiter(" ");
		
		while(sc2.hasNextInt()) {
			int n = sc2.nextInt();
			System.out.print(n);
		}
		sc.close();
		sc2.close();
	}
}
