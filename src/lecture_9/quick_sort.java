package lecture_9;

import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,1,6,3,4};


  System.out.println(quick(arr,0,arr.length-1)); 

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
