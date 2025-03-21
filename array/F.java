package array;

import java.util.Arrays;

public class F {
	
	private static int bs(int[] arr, int key) {
		int size=arr.length;
		int idxMinMax=-1;
		if(size==0) {
			return idxMinMax;
		}
		int start = 0, end=size-1;
		int mid = start + (end-start)/2;
		while(start<end) {
			mid = start + (end-start)/2;
			if(arr[mid]>key) {
				idxMinMax=mid;
			}
			else {
				if(arr[mid+1]>key) {
					idxMinMax=mid+1;
				}
			}
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
		return idxMinMax;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,6,8,11};
		int key=4;
		Arrays.sort(arr);
		System.out.println(bs(arr,key));
	}
}
