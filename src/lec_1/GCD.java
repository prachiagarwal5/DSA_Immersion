package lec_1;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=15;
int ans=1;
for(int i=Math.min(a, b);i>=2;i--) {
	if(a%i==0 && b%i==0) {
		ans=i;
	}
}
System.out.println(ans);
	}

}
