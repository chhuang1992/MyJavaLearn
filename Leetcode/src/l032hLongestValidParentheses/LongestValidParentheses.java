package l032hLongestValidParentheses;

import java.util.LinkedList;
import java.util.Stack;

public class LongestValidParentheses {
	
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
        Stack<Bracket> stack = new Stack<Bracket>();
        LinkedList<ValidBracket> validBracketList = new LinkedList<ValidBracket>();
        for(int i=0;i<len;++i){
            char currChar = s.charAt(i);
            if(currChar=='('){
                stack.push(new Bracket(currChar,i));
            }else if(stack.empty()&&currChar==')'){
                stack = new Stack<Bracket>();
            }else{
                int start = stack.peek().position;
                int end = i;
                int listSize = validBracketList.size();
                if(listSize==0){
                    validBracketList.add(new ValidBracket(start,end));
                }else{
                    for(int j=0;j<validBracketList.size();++j){
                        int endInList = validBracketList.get(j).end;
                        int startInList = validBracketList.get(j).start;
                        if(endInList+1==start){
                            start = startInList;
                            validBracketList.remove(j);
                            --j;
                        }else if(startInList>start){
                            validBracketList.remove(j);
                            --j;
                        }
                    }
                    validBracketList.add(new ValidBracket(start,end));
                }
                stack.pop();
            }
        }
        for(int i=0;i<validBracketList.size();++i){
            int currLong = validBracketList.get(i).end - validBracketList.get(i).start + 1;
            longest = Math.max(longest,currLong);
        }
        return longest;
    }
    public static class Bracket{
        public char type;
        public int position;
        public Bracket(char type,int position){
            this.type = type;
            this.position = position;
        }
    }
    public static class ValidBracket{
        public int start;
        public int end;
        public ValidBracket(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
}
