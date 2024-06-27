package assignment_3;

public class check_array_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		 boolean flag= print(arr,n,0);
	      System.out.println(flag);
	    }
	    public static boolean print(int arr[],int n,int i){
	       if (i <= n - 1) {
	            return true;
	        }
	        if (arr[i] > arr[i + 1]) {
	            return false;
	        }
	        return print(arr, n, i + 1);
	}

}
