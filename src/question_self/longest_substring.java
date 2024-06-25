package question_self;

import java.util.Arrays;

public class longest_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,2,3,3,6,5,0};
    System.out.println(longestConsecutive(nums));
	}
	public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0  ){
            return 0;
        }
        int count=1;
        int ans=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                count++;
           ans= Math.max(ans,count);
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                
                    count=1;
                }
            }
        
       
        return ans;
    }
}
