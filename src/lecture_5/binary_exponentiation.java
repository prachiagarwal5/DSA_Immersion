package lecture_5;

public class binary_exponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=5;
int n=3;
System.out.println(print(x,n));
	}
public static int print(int x,int n) {
	if(n==0) {
		return 1;
	}
	int ans=print(x,n/2);
	int fin=ans*ans;
	if(n%2==0) {
	     return fin;
	}
	
	return x*fin;
}
}
