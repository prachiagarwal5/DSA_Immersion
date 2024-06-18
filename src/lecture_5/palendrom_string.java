package lecture_5;

public class palendrom_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="121";
System.out.println(print(str,"",str.length()));
	}
public static boolean print(String str,String ans,int n) {
	if(str==ans ) {
		return true;
	}
	if(n<0) {
		return false;
	}
	
	char m=str.charAt(n);

	print(str,ans+m,n-1);
	System.out.println(ans);
	return false;
}
}
