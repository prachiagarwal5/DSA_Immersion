package question_self;

import java.util.ArrayList;

public class rat_in_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int m[][]={{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}};
 int n=4;
 findPath(m,n);
 
	}
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList <String> list=new ArrayList<>();
        boolean vis[][]=new boolean[n][n];
        if(m[0][0]==0 || m[n-1][n-1]==0) return list;
        print(m,n,0,0,"",list,vis);
        return list;
    }
    public static void print(int arr[][], int n ,int i,int j,String ans,ArrayList <String> list,boolean vis[][]){
        if(i==n-1 && j==n-1){
            list.add(ans);
            return;
        }
        if(i<0 || i>=n || j<0 || j>=n || arr[i][j]==0 || vis[i][j]){
            return;
        }
    vis[i][j]=true;
      //top
        
        print(arr,n,i-1,j,ans+"U",list,vis);
        //bottom
        print(arr,n,i+1,j,ans+"D",list,vis);
        //left
        print(arr,n,i,j-1,ans+"L",list,vis);
        //right
        print(arr,n,i,j+1,ans+"R",list,vis);
        vis[i][j]=false;

    }

}
