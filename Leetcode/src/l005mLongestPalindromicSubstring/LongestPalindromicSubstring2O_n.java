package l005mLongestPalindromicSubstring;

import java.util.Scanner;

//http://articles.leetcode.com/longest-palindromic-substring-part-ii/
//https://www.felix021.com/blog/read.php?2040 Manacher's ALGORITHM: O(n)时间求字符串的最长回文子串;
public class LongestPalindromicSubstring2O_n {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(longestPalindrome(s));
	}
	
	public static String preProcess(String s) {
		int n = s.length();
		if (n == 0) return "^$";
		String ret = "^";
		for (int i = 0; i < n; i++)
			ret += "#" + s.charAt(i);
		 
		ret += "#$";
		return ret;
	}
		 
	public static String longestPalindrome(String s) {
		String T = preProcess(s);
		int n = T.length();
		int[] P = new int[n];
		int C = 0, R = 0;
		for (int i = 1; i < n-1; i++) {
			int i_mirror = 2*C-i; // equals to i' = C - (i-C)
		    
			P[i] = (R > i) ? Math.min(R-i, P[i_mirror]) : 0;
		    
		    // Attempt to expand palindrome centered at i
			while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i]))
				P[i]++;
		 
		    // If palindrome centered at i expand past R,
		    // adjust center based on expanded palindrome.
			if (i + P[i] > R) {
				C = i;
				R = i + P[i];
		    }
		}
		 
		// Find the maximum element in P.
		int maxLen = 0;
		int centerIndex = 0;
		for (int i = 1; i < n-1; i++) {
			if (P[i] > maxLen) {
				maxLen = P[i];
				centerIndex = i;
			}
		}
		  
		//return s.substr((centerIndex - 1 - maxLen)/2, maxLen);
		return s.substring((centerIndex - 1 - maxLen)/2, (centerIndex - 1 + maxLen)/2);
	}
}
