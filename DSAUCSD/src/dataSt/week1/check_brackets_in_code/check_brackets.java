package dataSt.week1.check_brackets_in_code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        //Stack LIFO;
        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
            	opening_brackets_stack.push(new Bracket(next,position));
            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
            	if(opening_brackets_stack.empty()){
            		System.out.println(position+1);
            		return;
            	}else{
            		if(opening_brackets_stack.peek().Match(next)){
            			opening_brackets_stack.pop();
            		}else{
            			System.out.println(position+1);
            			return;
            		}
            	}
            }
        }

        // Printing answer, write your code here
        if(opening_brackets_stack.empty()){
        	System.out.println("Success");
        }
    }
}
