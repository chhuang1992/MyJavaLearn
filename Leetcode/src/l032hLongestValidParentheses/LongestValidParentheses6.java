package l032hLongestValidParentheses;

public class LongestValidParentheses6 {
	
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
	from @jerryrcwong C++
	int longestValidParentheses(string s) {
        if(s.length() <= 1) return 0;
        int curMax = 0;
        vector<int> longest(s.size(),0);
        for(int i=1; i < s.length(); i++){
            if(s[i] == ')'){
                if(s[i-1] == '('){
                    longest[i] = (i-2) >= 0 ? (longest[i-2] + 2) : 2;
                    curMax = max(longest[i],curMax);
                }
                else{ // if s[i-1] == ')', combine the previous length.
                    if(i-longest[i-1]-1 >= 0 && s[i-longest[i-1]-1] == '('){
                        longest[i] = longest[i-1] + 2 + ((i-longest[i-1]-2 >= 0)?longest[i-longest[i-1]-2]:0);
                        curMax = max(longest[i],curMax);
                    }
                }
            }
            //else if s[i] == '(', skip it, because longest[i] must be 0
        }
        return curMax;
    }
	 */
	
	public static int longestValidParentheses(String s) {
		int len = s.length();
		if(len <= 1) return 0;
        int curMax = 0;
        int[] longest = new int[len];
        for(int i=1; i < len; i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1) == '('){
                    longest[i] = (i-2) >= 0 ? (longest[i-2] + 2) : 2;
                    curMax = Math.max(longest[i],curMax);
                }
                else{ // if s[i-1] == ')', combine the previous length.
                    if(i-longest[i-1]-1 >= 0 && s.charAt(i-longest[i-1]-1) == '('){
                        longest[i] = longest[i-1] + 2 + ((i-longest[i-1]-2 >= 0)?longest[i-longest[i-1]-2]:0);
                        curMax = Math.max(longest[i],curMax);
                    }
                }
            }
            //else if s[i] == '(', skip it, because longest[i] must be 0
        }
        return curMax;
	}
}
