package lec_1;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int m=5;
   for(int n=0;n<m;n++) {
	   int ncr=1;
	   for(int r=0;r<=n;r++) {
		   System.out.print(ncr + " ");
		   ncr=((n-r) * ncr)/(r+1);
	   }
	   System.out.println();
   }
	}

}
