package Assignment2;
import java.util.*;
public class rotated_and_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        int d=0;
       int n=arr.length;
        
        while(d<n){
            int arr3[] =new int[arr.length];
            for(int i=0;i<arr.length;i++){
                arr3[i]=arr[i];
            }
            
            rotate(arr3,0,n-1);
            rotate(arr3,0,d-1);
            rotate(arr3,d,n-1);
            
           
        
            
            if(arr3 == arr1) 
            System.out.println("sorted");
            d++;
        
        }
    
    }
    public static void  rotate(int arr[],int p1,int p2){
        while(p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
	}

}
