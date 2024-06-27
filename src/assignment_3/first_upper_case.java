package assignment_3;

public class first_upper_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="geeksforgeaEKs";
 
 System.out.println(print(str)); 
	}
public static char print(String str) {
	if(str.length()==0) {
		return 'm';
	}
	int ch=str.charAt(0);
	if(ch>=65 && ch<=90) {
		return (char)ch;
	}
	return print(str.substring(1)); 
}
}
