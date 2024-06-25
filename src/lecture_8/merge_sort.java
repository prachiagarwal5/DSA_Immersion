package lecture_8;

import java.util.Arrays;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//merge two arrays
int arr[]= {1,2,5};
int arr1[]= {1,2,3,5};
int arr2[]=new int[arr.length+arr1.length];
int i=0;
int j=0;
int k=0;
while(i<arr.length && j<arr1.length) {
    
	if(arr[i]<=arr1[j]) {
		arr2[k]=arr[i];
		i++;
	}
	else  {
		arr2[k]=arr1[j];
		j++;
	}
	k++;
}
while(i<arr.length) {
	arr2[k++]=arr[i];
	i++;
}
while(j<arr1.length) {
	arr2[k++]=arr1[j];
	j++;
}
System.out.println(Arrays.toString(arr2));
	}

}
