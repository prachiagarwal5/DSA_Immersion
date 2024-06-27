package assignment_3;

public class x_powe_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=2;
		int n=-2;
		 System.out.println(print(x,n)); 
    }
    public static double print(double x,int n){
        if(n==0){
            return 1 ;
        }
        else if(n<0){
           return  1/(x*print(x,(-n)-1));
        }
        else if(n%2==0) {
			double a = print(x,n/2);
			return a*a;
		}

        
         return x*print(x,n-1);
	}

}
