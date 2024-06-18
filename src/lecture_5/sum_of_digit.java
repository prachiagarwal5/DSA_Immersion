package lecture_5;

public class sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=134;
print(n);
	}
public static int  print(int n) {
	if(n==0) {
		return 0;
	}
	int m=n%10;
	return print(n/10)+m;
}
}
