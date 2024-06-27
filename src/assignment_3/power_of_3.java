package assignment_3;

public class power_of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=27;
	    boolean flag =print(n);
	       System.out.println(flag);
	    }
	    public static boolean print(int n){
	        if(n==1){
	            return true;
	        }
	        
	       if(n==0 || n%3!=0){
	        return false;
	       }
	       return print(n/3);
	}

}
