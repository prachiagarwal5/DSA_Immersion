package lec_4;

public class Longest_substrng_without_repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String st="abcdaabcdef";
    System.out.println(max(st)) ;
	}
public static int max(String str) {
	int maxWindow=0;
	int s=0;
	int e=0;
	int arr[]=new int[256];
	while(e<str.length()) {
		int index=str.charAt(e);
		arr[index]++;
		while(arr[index]>1) {
			int r_index=str.charAt(s);
			arr[r_index]--;
			s++;
		}
		int curr=e-s+1;
		maxWindow=Math.max(maxWindow, curr);
		e++;
	}
	return maxWindow;
}
}
