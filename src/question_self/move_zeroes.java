package question_self;

import java.util.Arrays;

public class move_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {0,34,0,8,93,0};
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
