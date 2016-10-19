package l020eValidParentheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        System.out.println(isValid(text));
	}
	public static boolean isValid(String s) {
        Stack<Character> opening_brackets_stack = new Stack<Character>();
        for (int position = 0; position < s.length(); ++position) {
            char next = s.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
            	opening_brackets_stack.push(next);
            }

            if (next == ')' || next == ']' || next == '}') {
            	if(opening_brackets_stack.empty()){
            		return false;
            	}else{
            		if(Match(opening_brackets_stack.peek(),next)){
            			opening_brackets_stack.pop();
            		}else{
            			return false;
            		}
            	}
            }
        }
        if(opening_brackets_stack.empty()){
        	return true;
        }
        return false;
    }
    
    public static boolean Match(char c1,char c2) {
        if (c1 == '[' && c2 == ']')
            return true;
        if (c1 == '{' && c2 == '}')
            return true;
        if (c1 == '(' && c2 == ')')
            return true;
        return false;
    }
}
