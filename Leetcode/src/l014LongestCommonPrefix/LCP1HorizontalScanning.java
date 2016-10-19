package l014LongestCommonPrefix;

import java.util.Scanner;

public class LCP1HorizontalScanning {
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
		if (strs.length == 0) return "";
		String lcp = strs[0];
		for(int i=1;i<strs.length;i++){
			while(strs[i].indexOf(lcp)!=0){
				lcp = lcp.substring(0, lcp.length()-1);
				if(lcp.isEmpty())  return "";
			}
		}
		return lcp;
	}
}
