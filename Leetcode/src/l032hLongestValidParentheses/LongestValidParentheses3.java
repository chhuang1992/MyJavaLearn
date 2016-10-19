package l032hLongestValidParentheses;

import java.util.Stack;

public class LongestValidParentheses3 {
	
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
	public static int longestValidParentheses(String s) {
        int len = s.length();
        int longest = 0;
        if(s.indexOf("()")==-1){
            return longest;
        }
        Stack<Integer> start = new Stack<Integer>();
        Stack<Integer> end = new Stack<Integer>();
        int sub = 0;
        while(sub<len&&s.substring(sub,len).indexOf("()")!=-1){
            int startIndex = sub + s.substring(sub,len).indexOf("()");
            int endIndex = startIndex+1;
            while(startIndex>=0 && endIndex<=len-1){
                if(startIndex>0 && endIndex<len-1&&s.charAt(startIndex-1)=='('&&s.charAt(endIndex+1)==')'){
                    --startIndex;
                    ++endIndex;
                }else if(start.size()>0&&end.peek()+1==startIndex){
                    startIndex = start.pop();
                    end.pop();
                }else{
                	sub=endIndex+1;
                    start.add(startIndex);
                    end.add(endIndex);
                    break;
                }
            }
        }
        while(!start.empty()){
            int currLong = end.pop()-start.pop()+1;
            longest = Math.max(longest,currLong);
        }
        return longest;
    }
}
