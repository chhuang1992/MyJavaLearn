package l032hLongestValidParentheses;

import java.util.Stack;

public class LongestValidParentheses5 {
	
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
	from @jmnjmnjmn
	 */
	
	public static int longestValidParentheses(String s) {
	    Stack<Integer> stack = new Stack<Integer>();
	    int max=0;
	    int left = -1;
	    for(int j=0;j<s.length();j++){
	        if(s.charAt(j)=='(') stack.push(j);            
	        else {
	            if (stack.isEmpty()) left=j;
	            else{
	                stack.pop();
	                if(stack.isEmpty()) max=Math.max(max,j-left);
	                else max=Math.max(max,j-stack.peek());
	               }
	            }
	        }
	    return max;
	}
}
