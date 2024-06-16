package assignment_1;
import java.util.*;
public class game_with_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int m=sc.nextInt();
		  System.out.println(print(m));
		}
	}
	public static String print(int m){
	     if (m % 3 == 0) {
        return "Second";
    }
	      if((m-1)%3==0 || (m+1)%3==0){
		        return "First";
		    }
		    for(int i=3;i<=9;i+=2){
		        if((m-i)%3==0 || (m+i)%3==0){
		            return "First";
		        }
		    }
		    return "Second";
	}

}
