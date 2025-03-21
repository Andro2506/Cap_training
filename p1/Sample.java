package p1;

public class Sample {
	public static void display() {
		System.out.println("Hello eve");
	}
	
	public static void displayStar() {
		
	}
	
	public static void main(String[] args) {
		int x = -235697;
		boolean check = false;
		if(x<0) {
			check=true;
			x*=(-1);
		}
		else {
			check = false;
		}
		int rev=0;
		while(x>0) {
			int rem = x%10;
			x/=10;
			rev = rev*10 + rem;
		}
		if(check) {
			System.out.println("-"+rev);
		}
		else {
			System.out.println(rev);
		}
	}
}
