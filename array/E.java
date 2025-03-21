package array;

import java.util.Arrays;
import java.util.Scanner;

public class E {
	
	private static int bs(int[] arr, int start, int end, int key) {
		if(start>end) return -1;
		int mid = start + (end-start)/2;
		if(key==arr[mid]) {
			return mid;
		}
		else if(key<arr[mid]) {
			return bs(arr,start,mid-1,key);
		}
		else {
			return bs(arr,mid+1,end,key);
		}
	}
	
	private static int bs(int[] arr, int key) {
		int size=arr.length;
		if(size==0) {
			return -1;
		}
		int start = 0, end=size-1;
		int mid = start + (end-start)/2;
		while(start<end) {
			mid = start + (end-start)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key element:");
		int key = sc.nextInt();
		Arrays.sort(arr);
		System.out.println(bs(arr,0,arr.length-1,key));
		System.out.println(bs(arr,key));
	}
}
