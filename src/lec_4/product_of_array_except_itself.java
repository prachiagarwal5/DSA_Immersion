package lec_4;

import java.util.Arrays;

public class product_of_array_except_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4};
System.out.println(Arrays.toString(pro(arr)));
	}
public static int[] pro(int arr[]) {
		int left[]=new int[arr.length];
		left[0]=1;
		for(int i=1;i<arr.length;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		int right[]=new int[arr.length];
		right[arr.length-1]=1;
		for(int i=arr.length-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=left[i]*right[i];
		}
		return arr;
}
}
