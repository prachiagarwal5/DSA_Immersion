package lec2;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {1,2,3,4,5};
 int a=0;
 int l=arr.length-1;
 while(a<l) {
	 int temp=arr[a];
	 arr[a]=arr[l];
	 arr[l]=temp;
 }
 System.out.println(arr.toString());
	}

}
