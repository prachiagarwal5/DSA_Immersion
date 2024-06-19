package question_self;

import java.util.Arrays;

public class largest_subarray_sum_kadane_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-2,-3,-4,-8,9,8,-3};
System.out.println(maxSubArray(arr));
	}
	 public static  int maxSubArray(int[] nums) {
		    int sum=0;
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<nums.length;i++){
		        sum+=nums[i];
		        if(sum>max){
		            max=sum;
		        }
		        if(sum<0){
		            sum=0;
		        }
		    }
		 return max;
		    }
}
