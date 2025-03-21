package mathods;

public class G {

	public static void displayAscii(char ch) {
		System.out.println(ch + "->" + (int) ch);
	}

	public static void displayFullName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	public static int returnAscii(char c) {
		return c;
	}

	public static void main(String[] args) {
//		displayAscii('c');
//
//		displayFullName("Soham", "Das");
		int res = returnAscii('b');
		System.out.println(res);
	}
}
