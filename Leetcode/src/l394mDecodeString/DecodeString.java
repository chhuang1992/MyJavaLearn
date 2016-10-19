package l394mDecodeString;

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String exp = scanner.next();
        System.out.println(decodeString(exp));
	}
	
	/**
	 * The encoding rule is: k[encoded_string], 
	 * where the encoded_string inside the square brackets is being repeated exactly k times. 
	 * Note that k is guaranteed to be a positive integer.
	 * You may assume that the input string is always valid; 
	 * No extra white spaces, square brackets are well-formed, etc.
	 * Furthermore, you may assume that the original data does not contain any digits 
	 * and that digits are only for those repeat numbers, k. 
	 * For example, there won't be input like 3a or 2[4]
	 * s = "3[a]2[bc]", return "aaabcbc".
	 * s = "3[a2[c]]", return "accaccacc".
	 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
	 */
	public static String decodeString(String s){
		String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                //int count = 0;
                String scount = "";
                while (Character.isDigit(s.charAt(idx))) {
                    //count = 10 * count + (s.charAt(idx) - '0');
                	//count = 10 * count + Integer.parseInt(""+s.charAt(idx));
                	scount += s.charAt(idx);
                    idx++;
                }
                int count = Integer.parseInt(scount);
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {
                res += s.charAt(idx++);
            }
        }
        return res;		
	}

}
