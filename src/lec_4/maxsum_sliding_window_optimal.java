package lec_4;

public class maxsum_sliding_window_optimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,43,7,8};
		int k=3;
		int current_sum=0;
		int max=0;
		int n=arr.length;
		for(int i=0;i<k;i++) {
			current_sum+=arr[i];
		}
		for(int i=k;i<arr.length;i++) {
			current_sum=current_sum+arr[i]-arr[i-k];
			max=Math.max(max, current_sum);
		}
		System.out.println(max);
	}

}
