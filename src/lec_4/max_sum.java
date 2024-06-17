package lec_4;

public class max_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,5,43,7,8};
int k=3;
int sum=0;
int max=0;
for(int i=0;i<k;i++) {
	for(int j=i;j<i+k;j++) {
		sum+=arr[j];
		if(max<sum) {
			max=sum;
		}
	}
	
	sum=0;
}
System.out.println(max);
	}

}
