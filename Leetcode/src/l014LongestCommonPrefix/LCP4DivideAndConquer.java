package l014LongestCommonPrefix;

//import java.util.Arrays;
import java.util.Scanner;

public class LCP4DivideAndConquer {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] strs=new String[n];
		for(int i=0;i<n;i++){
			strs[i]=scanner.next();
		}
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs){
		if(strs==null||strs.length==0) return "";
		return longestCommonPrefix(strs,0,strs.length-1);		
	}
	
	public static String longestCommonPrefix(String[] strs,int l,int r){
		if(l==r){
			return strs[l];
		}
		int mid = (l+r)/2;
		String lcpleft  = longestCommonPrefix(strs, l, mid);
		String lcpright = longestCommonPrefix(strs, mid+1, r);
		return commonPrefix(lcpleft,lcpright);
	}
	
	public static String commonPrefix(String lcpleft,String lcpright){
		//StringBuilder lcp = new StringBuilder();
		//String lcp = "";
		int len = Math.min(lcpleft.length(), lcpright.length());		
		for(int i=0;i<len;i++){
			//if(lcpleft.charAt(i)==lcpright.charAt(i)){
				//lcp.append(strs[0].charAt(i));
				//lcp += lcpleft.charAt(i);
			//}
			//else{
				//return lcp.toString();
				//return lcp;
			//}
			if(lcpleft.charAt(i)!=lcpright.charAt(i)){
				return lcpleft.substring(0, i);
			}
		}
		//return lcp.toString();
		//return lcp;
		return lcpleft.substring(0, len);
	}
}
