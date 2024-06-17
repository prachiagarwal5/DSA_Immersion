package question_self;
import java.util.*;
public class appear_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,6,3,6,3,9,9};
System.out.println(singleNumber(arr));
	}

public static int singleNumber(int arr[]) {
        
        if(arr.length == 1)
            return arr[0];
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]==arr[i+1]){
            i++;
           }
           else{
            return arr[i];
           }
        }
        return arr[arr.length-1];
    }
}
