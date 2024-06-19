package question_self;

import java.util.Arrays;

public class sort_colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,1,2,1,0,0,0};

sortColors(arr);
System.out.println(Arrays.toString(arr));

	}
	public static void sortColors(int[] arr) {
		   int left=0;
		   int right=arr.length-1;
		    int mid=0;
		    while(mid<=right){
		        if(arr[mid]==0){
		            swap(arr,left,mid);
		            left++;
		            mid++;
		        }
		        else if(arr[mid]==1){
		            mid++;
		        }
		        else{
		            swap(arr,mid,right);
		            right--;

		        }
		    }
		        
		    }
		    public static void swap(int nums[],int i,int j){
		        int temp=nums[i];
		        nums[i]=nums[j];
		        nums[j]=temp;
		    }
}
