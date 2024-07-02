package question_self;

public class count_good_number {
	 static long mod = 1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(countGoodNumbers(n));
	}
	    public static int countGoodNumbers(long n) {
	        long count4=n/2;
	        long count5=(n+1)/2;
	        long total4=pow(4,count4);
	        long total5=pow(5,count5);
	        return (int)(total4*total5 % mod); 
	     }
	     public static  long pow(long x,long n){
	         if(n==0){
	            return 1;
	         }
	       long ans=  pow(x,n/2);
	         if(n%2==0){
	              return (ans*ans)%mod;
	         }
	         else
	         return (x*ans*ans)%mod;
	}

}
