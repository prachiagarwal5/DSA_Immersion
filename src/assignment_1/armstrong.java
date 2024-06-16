package assignment_1;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=123;
System.out.println(armstrongNumber( n));
	}
	public static String armstrongNumber(int n){
        // code here
        int arm=0;
        int m=n;
        while(n!=0){
            int rev=n%10;
            arm=arm+(rev*rev*rev);
            n/=10;
        }
        if(arm==m){
          return "Yes";  
        }
        return "No";
    }
}
