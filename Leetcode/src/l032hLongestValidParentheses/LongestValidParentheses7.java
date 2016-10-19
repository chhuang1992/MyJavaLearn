package l032hLongestValidParentheses;

public class LongestValidParentheses7 {
	
	/**
	 "(()"  2;
	 ")()())"  4;
	 "()"  2;
	 "()(()"  2;
	 "())"  2;
	 "()(())"  6;
	 "(()(((()"  2;
	 "(()()"  4;
	 */
	
	public static void main(String[] args){
		System.out.println(longestValidParentheses("(()"));
		System.out.println(longestValidParentheses(")()())"));
		System.out.println(longestValidParentheses("()"));
		System.out.println(longestValidParentheses("()(()"));
		System.out.println(longestValidParentheses("())"));
		System.out.println(longestValidParentheses("()(())"));
		System.out.println(longestValidParentheses("(()(((()"));
		System.out.println(longestValidParentheses("(()()"));
	}
	
	/**
	from @jerryrcwong @Philip0116 C++
	int longestValidParentheses(string s) {
        if(s.length() <= 1) return 0;
        int curMax = 0;
        vector<int> longest(s.size(),0);
        for(int i=1; i < s.length(); i++){
            if(s[i] == ')' && i-longest[i-1]-1 >= 0 && s[i-longest[i-1]-1] == '('){
                longest[i] = longest[i-1] + 2 + ((i-longest[i-1]-2 >= 0)?longest[i-longest[i-1]-2]:0);
                curMax = max(longest[i],curMax);
            }
        }
        return curMax;
    }
	 */
	
	public static int longestValidParentheses(String s) {
		int len = s.length();
		if(s.length() <= 1) return 0;
        int curMax = 0;
        int[] longest = new int[len];
        for(int i=1; i < s.length(); i++){
            if(s.charAt(i) == ')' && i-longest[i-1]-1 >= 0 && s.charAt(i-longest[i-1]-1) == '('){
                longest[i] = longest[i-1] + 2 + ((i-longest[i-1]-2 >= 0)?longest[i-longest[i-1]-2]:0);
                curMax = Math.max(longest[i],curMax);
            }
        }
        return curMax;
	}
}
