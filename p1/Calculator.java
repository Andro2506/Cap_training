package p1;

public class Calculator {
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	public static int sub(int num1, char num2) {
		return num1-num2;
	}
	public static int sub(int num1, int num2, int num3) {
		return num1-num2-num3;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static int mul(int num1, int num2, int num3) {
		return num1*num2*num3;
	}
	
	public static void main(String[] args) {
		System.out.println(sub(20,10));
		System.out.println(sub(20,'a'));
		System.out.println(sub(20,10,5));
		System.out.println(mul(20,10));
		System.out.println(mul(20,10,5));
	}
}
