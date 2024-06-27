package lecture_9;

import java.util.Arrays;

public class quick_sort_final {

	public static void main(String[] args) {n 
		// TODO Auto-generated method stub
		int arr[]= {5,1,6,3,4};


		 quickSort(arr,0,arr.length-1);
		 System.out.println(Arrays.toString(arr));
	}
public static void quickSort(int arr[],int s,int e) {
	if(s>=e) {
		return;
	}
	int index=quick(arr,s,e);
	quickSort(arr,s,index-1);
	quickSort(arr,index+1,e);
}
public static int quick(int arr[],int s,int e) {
	int pos=s;
	int x=arr[e];
	for(int i=s;i<e;i++) {
		if(arr[i]<x) {
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
			pos++;
		}
	}
	int temp=arr[e];
	arr[e]=arr[pos];
	arr[pos]=temp;
	return pos;
}
}
