package l022mGenerateParentheses;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<String> list = generateParentheses(n);
		System.out.println(list);
		System.out.println(list.size());
	}
	public static List<String> generateParentheses(int n){
		List<String> list = new LinkedList<String>();
		backtrack(list,"",0,0,n);
		return list;
	}
	public static void backtrack(List<String> list, String str, int open, int close, int max){
		if(str.length() == max*2){
			list.add(str);
			return;
		}
		if(open<max){
			backtrack(list,str+"(",open+1,close,max);
		}
		if(close<open){
			backtrack(list,str+")",open,close+1,max);
		}
	}
}
