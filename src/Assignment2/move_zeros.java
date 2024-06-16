package Assignment2;

import java.util.Arrays;

public class move_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {0,2,1,3,0,3};
    moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
	}
	public static void moveZeroes(int[] arr) {
	      int left=0;
	      for(int right=0;right<arr.length;right++){
	        if(arr[right]!=0){
	            int temp=arr[right];
	            arr[right]=arr[left];
	            arr[left]=temp;
	            left++;
	        }
	      }
	       } 
}
