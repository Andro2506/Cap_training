package Oops;

class Laptop{
	String brand;
	double price;
	int ram;
	
	protected Laptop(String brand, double price, int ram) {
		this.brand = brand;
		this.price= price;
		this.ram = ram;
	}
	
//	protected void display() {
//		System.out.println(this.brand);
//		System.out.println(this.price);
//		System.out.println(this.ram);
////		System.out.println("Object address: "+this);
//	}
	
	
}


public class Driver {
	public static void main(String[] args) {
		Laptop m1 = new Laptop("Dell", 65000,8);
//		m1.display();
		System.out.println(m1.brand+"\t"+m1.price+"\t"+m1.ram);
		
		Laptop m2 = new Laptop("Hp", 55000,8);
		System.out.println(m2.brand+"\t"+m2.price+"\t"+m2.ram);
//		
//		System.out.println(m1==m2);
	}
}