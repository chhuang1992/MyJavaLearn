package l014LongestCommonPrefix;

import java.util.Scanner;

public class LCP2VerticalScanning {
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
		String lcp = strs[0];
		if(strs==null||strs.length==0) return "";
		for(int i=0;i<strs[0].length();i++){
			char c = strs[0].charAt(i);
			for(int j=1;j<strs.length;j++){
				if(i==strs[j].length()||strs[j].charAt(i)!=c){
					return strs[0].substring(0, i);
				}
			}
		}
		return lcp;
	}
}
