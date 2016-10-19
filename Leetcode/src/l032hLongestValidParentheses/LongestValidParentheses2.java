package l032hLongestValidParentheses;

import java.util.LinkedList;

public class LongestValidParentheses2 {
	
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
        LinkedList<ValidBracket> validBracketList = new LinkedList<ValidBracket>();
        int sub = 0;
        while(sub<len&&s.substring(sub,len).indexOf("()")!=-1){
            int startIndex = sub + s.substring(sub,len).indexOf("()");
            int endIndex = startIndex+1;
            while(startIndex>=0 && endIndex<=len-1){
                if(startIndex>0 && endIndex<len-1&&s.charAt(startIndex-1)=='('&&s.charAt(endIndex+1)==')'){
                    --startIndex;
                    ++endIndex;
                }else if(validBracketList.size()>0&&validBracketList.getLast().end+1==startIndex){
                    startIndex = validBracketList.getLast().start;
                    validBracketList.removeLast();
                }else{
                	sub=endIndex+1;
                    validBracketList.add(new ValidBracket(startIndex,endIndex));
                    break;
                }
            }
        }
        for(int i=0;i<validBracketList.size();++i){
            int currLong = validBracketList.get(i).end - validBracketList.get(i).start + 1;
            longest = Math.max(longest,currLong);
        }
        return longest;
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
