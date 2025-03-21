package p1;

public class E {
	public static void main(String[] args) {
		int [] arr = {9};
		int x=0;
		for(int i=0;i<arr.length;i++) {
			x=x*10 + arr[i];
		}
		x+=1;
		int y=x;
		int size=0;
		while(x>0) {
			x/=10;
			size++;
		}
		int[] arr2 = new int[size];
		for(int i=0;i<size;i++) {
			int rem = y%10;
			y/=10;
			arr2[size-1-i]=rem;
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr2[i]);
		}
	}

}
