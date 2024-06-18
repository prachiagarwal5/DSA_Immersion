package lecture_5;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b=2;
int p=3;
System.out.println(print(b,p));
	}
public static int print(int b,int p) {
	if(p==0) {
		return 1;
	}
	if(p==1) {
		return b;
	}
	return b*print(b,p-1);
}
}
