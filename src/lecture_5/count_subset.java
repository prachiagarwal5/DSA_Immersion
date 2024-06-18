package lecture_5;

public class count_subset {
	static int arr[]= {1,2,3,4,5};
	static int target=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.out.println(print(0,arr.length-1)); 
	}
public static int print(int sum,int idx) {
	if(idx==-1) {
		return (sum==target?1:0);
	}
	int count=print(sum+arr[idx],idx-1);
	int countnot=print(sum,idx-1);
	return count+countnot;
}
}
