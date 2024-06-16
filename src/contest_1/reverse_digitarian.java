package contest_1;

public class reverse_digitarian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=32145;
int len=0;
int m=n;
while(n!=0) {
	len++;
     n/=10;
     
}
int arr[]=new int[len];
for(int i=0;i<len;i++) {
	arr[i]=m%10;
	
}
	}

}
