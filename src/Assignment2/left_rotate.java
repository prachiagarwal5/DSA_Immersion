package Assignment2;

import java.util.Arrays;

public class left_rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,1,4,5};
		int n=5;
		int d=2;
		   d=d%n;
	        rotate(arr,0,n-1);
	        
	        rotate(arr,0,n-d-1);
	       
	        rotate(arr,n-d,n-1);
	        System.out.println(Arrays.toString(arr));
	    }
	    static  void rotate(int [] arr,int p1,int p2){
	        while(p1<p2){
	            int temp=arr[p2];
	            arr[p2]=arr[p1];
	            arr[p1]=temp;
	            p1++;
	            p2--;
	        }
	    }
	}


