package lecture_8;

import java.util.Arrays;

public class merge_sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr = {6,3,2,1,5,6,4,52,34};
	System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1))) ;

	}
	public static int[] mergeSort(int arr[],int start,int end) {
		if(start==end) {
			int a[]=new int[1];
			a[0]=arr[start];
			return a;
		}
		int mid=(start+(end-start)/2);
		int left[]=mergeSort(arr,start,mid);
		int right[]=mergeSort(arr,mid+1,end);
		return print(left,right);
	}
public static int[] print(int arr[],int brr[]) {
	int i=0;
	int j=0;
	int k=0;
	int ans[]=new int [arr.length+brr.length];
	while(i<arr.length && j<brr.length) {
		if(arr[i]<=brr[j]) {
			ans[k]=arr[i];
			i++;
		}
		else {
			ans[k]=brr[j];
			j++;
		}
		k++;
	}
	while(i<arr.length) {
		ans[k++]=arr[i];
		i++;
	}
	while(j<brr.length) {
		ans[k++]=brr[j];
		j++;
	}
	return ans;
}
}
