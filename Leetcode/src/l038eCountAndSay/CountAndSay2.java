package l038eCountAndSay;

public class CountAndSay2 {

	public static void main(String[] args) {
		for(int i=1;i<16;++i){
			System.out.println(countAndSay(i));
		}		
	}
	public static String countAndSay(int n) {
		StringBuilder curr=new StringBuilder("1");
    	StringBuilder prev;
    	int count;
    	char say;
        for (int i=1;i<n;i++){
        	prev=curr;
 	        curr=new StringBuilder();       
 	        count=1;
 	        say=prev.charAt(0);
 	        
 	        for (int j=1,len=prev.length();j<len;j++){
 	        	if (prev.charAt(j)!=say){
 	        		curr.append(count).append(say);
 	        		count=1;
 	        		say=prev.charAt(j);
 	        	}
 	        	else count++;
 	        }
 	        curr.append(count).append(say);
        }	       	        
        return curr.toString();
    }

}
