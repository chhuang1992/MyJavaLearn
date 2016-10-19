package l014LongestCommonPrefix;

import java.util.Arrays;
import java.util.Scanner;

public class LCP3Sort {
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
		//StringBuilder lcp = new StringBuilder();
		String lcp = "";
		Arrays.sort(strs);
		int len = Math.min(strs[0].length(), strs[strs.length-1].length());		
		for(int i=0;i<len;i++){
			if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
				//lcp.append(strs[0].charAt(i));
				lcp += strs[0].charAt(i);
			}
			else{
				//return lcp.toString();
				return lcp;
			}
		}
		//return lcp.toString();
		return lcp;
	}
}
