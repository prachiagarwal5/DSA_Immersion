package lecture_5;

public class sum_of_n_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
System.out.println(print(n));
	}
public static int print(int n) {
	if(n==1) {
		return 1;
	}
	System.out.println(n);
	int ans=n+print(n-1);
	System.out.println(n);
	return ans ;
}
}
