package lec_3;

import java.util.Arrays;

public class cyclic_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 3, 2 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != i + 1) {
				System.out.println(i + " " + arr[i] + " - " + arr[i-1] + " " + arr[arr[i] - 1]);
//				temp = arr[i];
//				arr[i] = arr[arr[i] - 1];
//				arr[arr[i] - 1] = temp;
				int index = arr[i] - 1;
				temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
