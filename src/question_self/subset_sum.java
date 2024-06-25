package question_self;

import java.util.ArrayList;
import java.util.Scanner;

public class subset_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<arr.size();i++) {
			arr.set(i, sc.nextInt());
		}
		ArrayList<Integer> l1=new ArrayList<>();
        print(arr,0,l1,0);
        for(int i=0;i<l1.size();i++) {
        	System.out.println(l1.get(i));
        }
       
    }
    public static void print(ArrayList<Integer> arr,int idx,ArrayList<Integer> l1,int ans){
        if(idx==arr.size()){
            l1.add(ans);
            return;
        }
        if(idx>arr.size()){
            return;
        }
        print(arr,idx+1,l1,ans+arr.get(idx));
        print(arr,idx+1,l1,ans);
	}

}
