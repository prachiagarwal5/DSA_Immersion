package question_self;

import java.util.Arrays;

public class next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3};
nextPermutation(arr);
System.out.println(Arrays.toString(arr));
	}
	 public static void nextPermutation(int[] nums) {
	        int index=-1;
	        int index2 =-1;
	      int n=nums.length;
	      for(int i=n-2;i>=0;i--){
	        if(nums[i]<nums[i+1]){
	            index=i;
	            break;
	        }
	      }
	      if(index==-1){
	        reverse(nums,0);
	      }
	      else{
	        for(int i=n-1;i>=0;i--){
	           if( nums[i]>nums[index]){
	                index2=i;
	                break;
	            }
	        }
	        swap(nums,index,index2);
	        reverse(nums,index+1);
	      }
	    }
	 public static  void swap(int []nums,int i,int j){
	        int temp=nums[i];
	        nums[i]=nums[j];
	        nums[j]=temp;
	            }
	        public static    void reverse (int [] nums,int start){
	                int i=start;
	                int j=nums.length-1;
	                while(i<j){
	                    swap(nums,i,j);
	                    i++;
	                    j--;
	                }
	            }

}
