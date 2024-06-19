package lecture_6;

public class maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
print(0,0,3,""); 
	}
public static void print(int i,int j,int des,String ans) {
	if(i==des-1 && j==des-1) {
		System.out.println(ans);
		return;
	}
if(i==des || j==des) {
	return;
}
print(i+1,j,des,ans+"V");
print(i,j+1,des,ans+"H");
}
}
