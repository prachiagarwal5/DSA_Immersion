package lec_1;

public class GCD_Optimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=15;
		System.out.println(gcd(a,b));
	}
    public static int gcd(int a, int b) {
        // code here
        while(a>0 && b>0){
            if(a>b)
            a=a%b;
            else
            b=b%a;
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
