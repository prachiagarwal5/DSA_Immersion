package lecture_10;

public class recursive_function_for_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {7,8,17,10,5,6};
    print(arr,0);
    
	}
public static void print(int arr[],int i) {
	if(i>=arr.length || arr[i]==-1) {
		return;
	}
	print(arr,2*i+1);
	print(arr,2*i+2);
	System.out.println(arr[i]);
	
}
}
