package assignment_3;
import java.util.*;
public class Geek_onacci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		for(int i=0;i<m;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int n=sc.nextInt();
		   System.out.println(print(a,b,c,n));
		}
	}
	public static int print(int a,int b,int c, int n){
	    if(n==1){
	        return a;
	    }
	    if(n==2){
	        return b;
	    }
	    if(n==3){
	        return c;
	    }
	    if(n<0){
	        return -1;
	    }
	    return print(a,b,c,n-1)+print(a,b,c,n-2)+print(a,b,c,n-3);
	}

}
