package p1;
import java.math.*;

public class H {
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7,9};
		int rightMax=arr[arr.length-1], rightIndex=arr.length-1;
		int leftMax=arr[0], leftIndex=-1;
		for(int i=arr.length-2;i>=0;i--) {
			if(rightMax<arr[i]) {
				rightMax=arr[i];
				rightIndex=i;
			}
		}
		
		for(int i=1;i<=arr.length-1;i++) {
			if(leftMax<arr[i] && arr[i]!=rightMax) {
				leftMax=arr[i];
				leftIndex=i;
			}
		}
		rightIndex++;
		leftIndex++;
		
		System.out.println(rightMax);
		System.out.println(leftMax);
		
		System.out.println(rightIndex);
		System.out.println(leftIndex);
		
		int length = rightMax<
				leftMax? leftMax:rightMax;
//		System.out.println(length);
		
		int area = length * (Math.abs(rightIndex - leftIndex));
		System.out.println(area);
	}
}
