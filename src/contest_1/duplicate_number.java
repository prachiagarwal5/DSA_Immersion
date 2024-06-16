
package contest_1;
import java.util.*;
public class duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=0;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length;i++) {
    	  int index=arr[i]-1;
    	  if(arr[index]<0) {
    		  ans=i+1;
    		  System.out.println(ans);
    	  }
    	  else {
    		  arr[index]*=(-1);
    	  }
      }
      
	}

}
