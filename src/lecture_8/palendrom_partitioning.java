package lecture_8;

public class palendrom_partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="naman";
	palendrom(str,"");	
		
	}
		public static boolean isPalendrom(String str){
	        int s=0;
	        int end=str.length()-1;
	        while(s<=end){
	            if(str.charAt(s)!=str.charAt(end)){
	                return false;
	            }
	            s++;
	            end--;
	        }
	        return true;
	    }
	    public static void palendrom(String ques,String ans){
	        if(ques.length()==0){
	            System.out.println(ans );
	            return;
	        }
	    
	    for(int part=1;part<=ques.length();part++){
	        String partition=ques.substring(0,part);
	        String remaining=ques.substring(part);
	        if(isPalendrom(partition)){
	            palendrom(remaining,ans+partition+" ");
	        }
	}
	    }
}


