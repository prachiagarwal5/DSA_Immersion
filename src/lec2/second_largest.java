package lec2;

public class second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {4,5,5,9,17,1,9};
    int max=Integer.MIN_VALUE;
    int second_max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]>max) {
    		second_max=max;
    		max=arr[i];
    	}
    	else if(arr[i]!=max && arr[i]>second_max) {
    		second_max=arr[i];
    	}
    }
    System.out.println(second_max);
	}

}
