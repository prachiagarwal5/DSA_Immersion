package assignment_1;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1234;
System.out.println(reve(n));
	}
	  public static  int reve(int n) {
	       
	       long rev=0;
	       int m=n;
	       if(n<0){
	          m=(-1)*n;
	       }
	       while(m!=0){
	        int rem=m%10;
	        rev = rev * 10 + rem;
	        m/=10;
	        
	       } 
	        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
	            return 0;
	        }
	       if(n<0){
	        return (int)rev*-1;
	       }
	       return (int)rev;
}
}