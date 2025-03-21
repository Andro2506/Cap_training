package mathods;

import p1.*;

public class Calculator {

	public static double addition(double num1, double num2) {
		return num1 + num2;
	}

	public static int multiply(double a, double b, double c) {
		return (int) (a * b * c	);
	}

	public void test() {
		System.out.println("Hello static method!");
	}

	public static void main(String[] args) {
		System.out.println("Addition: " + addition(10.5, 55.3));
		System.out.println("Multiply: " + multiply(10.5, 55.4, 45.63));
		Sample.display();
		Calculator obj = new Calculator();
		obj.test();
	}
}
