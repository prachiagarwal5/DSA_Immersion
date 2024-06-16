package assignment_1;

public class co_prime_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {5,10,15};
		int n=arr.length;
	        // Complete the function
	        int count=0;
	        for(int i=1;i<n;i++){
	            if(gcd(arr[i-1],arr[i])!=1){
	                count++;
	            }
	        }
	      System.out.println(count);
	       
	    }
	    public static int gcd(int a, int b){
	        while(a>0 && b>0){
	            if(a>b){
	                a=a%b;
	            }
	            else{
	                b=b%a;
	            }
	            if(a==0){
	                return b;
	            }
	            if(b==0){
	                return a;
	            }
	        }
	        return 1;
	    }

}
