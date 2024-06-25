package lecture_7;

public class maze_in_4_direction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] arr=new int [3][3];
System.out.println(print(arr,0,0,"")); 
	}
public static int print(int [][]maze,int i,int j,String ans) {
	if(i==maze.length-1 && j==maze[0].length) {
		System.out.println(ans);
		return 1;
	}
	if(i==-1 || i==maze.length ||j==-1 || j==maze[0].length || maze[i][j]==-1) {
		return 0;
	}
	int count=0;
	maze[i][j]=-1;
	//top
	count+=print(maze,i-1,j,ans+"T");
	//left
	count+=print(maze,i,j-1,ans+"L");
	//bottom
	count+=print(maze,i+1,j,ans+"B");
	//right
	count+=print(maze,i,j+1,ans+"R");
	
	maze[i][j]=0;
	return count;
}
}
