package assignment_1;

public class palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1234;
  System.out.println(isPalindrome(n));
	}
    public static  boolean isPalindrome(int x) {
        long rev=0;
        int m=x;
        if(x<0){
            return false;
        }
        while(m!=0){
            int rem=m%10;
            rev=rev*10+rem;
            m/=10;
        }
       
       
        if(rev==x){
            return true;
        }
        return false;
    }
}


