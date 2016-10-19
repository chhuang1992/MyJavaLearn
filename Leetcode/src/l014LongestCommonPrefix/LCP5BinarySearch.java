package l014LongestCommonPrefix;

//import java.util.Arrays;
import java.util.Scanner;

public class LCP5BinarySearch {
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
		int minLen = strs[0].length();
		for(String str : strs){
			minLen = Math.min(minLen, str.length());
		}
		int l=0, r=minLen;
		while(l<=r){
			int mid = (l+r)/2;
			if(isCommonPrefix(strs,mid)){
				l=mid+1;
			}else{
				r=mid-1;
			}
		}
		return strs[0].substring(0, (l+r)/2);
	}
	
	public static boolean isCommonPrefix(String[] strs,int len){
		String str1 = strs[0].substring(0,len);
		for(int i=1;i<strs.length;i++){
			if(!strs[i].startsWith(str1))
				return false;
		}
		return true;
	}
}
