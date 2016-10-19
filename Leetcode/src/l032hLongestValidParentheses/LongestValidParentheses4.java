package l032hLongestValidParentheses;

import java.util.Stack;

public class LongestValidParentheses4 {
	
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
	from @cjxxm C++
	int longestValidParentheses(string s) {
        int n = s.length(), longest = 0;
        stack<int> st;
        for (int i = 0; i < n; i++) {
            if (s[i] == '(') st.push(i);
            else {
                if (!st.empty()) {
                    if (s[st.top()] == '(') st.pop();
                    else st.push(i);
                }
                else st.push(i);
            }
        }
        if (st.empty()) longest = n;
        else {
            int a = n, b = 0;
            while (!st.empty()) {
                b = st.top(); st.pop();
                longest = max(longest, a-b-1);
                a = b;
            }
            longest = max(longest, a);
        }
        return longest;
    }
	 */
	
	public static int longestValidParentheses(String s) {
        int len = s.length();
        int longest = 0;
        if(s.indexOf("()")==-1){
            return longest;
        }
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') st.push(i);
            else {
                if (!st.empty()) {
                    if (s.charAt(st.peek()) == '(') st.pop();
                    else st.push(i);
                }
                else st.push(i);
            }
        }
        if (st.empty()) longest = len;
        else {
            int a = len, b = 0;
            while (!st.empty()) {
                b = st.peek(); 
                st.pop();
                longest = Math.max(longest, a-b-1);
                a = b;
            }
            longest = Math.max(longest, a);;
        }
        return longest;
    }
}
