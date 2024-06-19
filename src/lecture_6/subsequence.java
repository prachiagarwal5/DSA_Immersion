package lecture_6;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
print(str,"");
	}
public static void print(String str,String ans) {
	if(str.length()==0) {
		System.out.println(ans);
		return;
	}
	char ch=str.charAt(0);
	print(str.substring(1),ans+ch);
	print(str.substring(1),ans);
}
}
