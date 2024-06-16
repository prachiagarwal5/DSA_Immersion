package assignment_1;

public class LCM_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Long a=15L;
Long b=10L;
System.out.println(lcmAndGcd(a,b));
	}
	public static Long[] lcmAndGcd(Long A , Long B){
        Long a = A;
        Long b = B;
        Long[] arr = new Long[2];
        while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
        }
        
        if(a == 0){
            arr[1] = b;
        }
        else{
            arr[1] = a;
        }
      
        
        arr[0] = (A * B) / arr[1];
        
        return arr;
    }
}
