package Oops;

class Laptop{
	String brand;
	double price;
	int ram;
	
//	protected Laptop(String brand, double price, int ram) {
//		this.brand = brand;
//		this.price= price;
//		this.ram = ram;
//	}
	
	Laptop(){
		System.out.println("Hello, I'm a no-arg user defined constructor!");
	}
	
	protected void display() {
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.ram);
//		System.out.println("Object address: "+this);
	}
	
	
}


public class Driver {
	public static void main(String[] args) {
		Laptop m1 = new Laptop();
		m1.brand = "ASUS";
		m1.price = 96560.61;
		m1.ram=16;
		m1.display();
		
//		Laptop m2 = new Laptop();
//		m2.display();
//		
//		System.out.println(m1==m2);
	}
}
