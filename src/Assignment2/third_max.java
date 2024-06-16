package Assignment2;

public class third_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,4,1,3};
     System.out.println(thirdMax(arr));
	}
	public static int thirdMax(int[] arr) {
	      long max=Long.MIN_VALUE;
	       long max2=Long.MIN_VALUE;
	        long max3=Long.MIN_VALUE;  
	  for(int i=0;i<arr.length;i++){
	    if(arr[i]>max){
	         max3 = max2;
	         max2 = max;
	        max=arr[i];
	    }
	    else if(arr[i]>max2 && arr[i]<max){
	        max3=max2;
	        max2=arr[i];
	    }
	    else if(arr[i]<max2 && arr[i]>max3 ){
	        max3=arr[i];
	    }
	  }
	  return max3 != Long.MIN_VALUE ? (int) max3 : (int) max;
	    }
}
