package l017mLetterPhoneNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LetterPhoneNumber1Naive {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String digits = scanner.next();
		System.out.println(letterCombinations(digits));
	}
	
	public static List<String> letterCombinations(String digits) {
        LinkedList<String> results = new LinkedList<>();
        for(int i=0;i<digits.length();i++){
        	if(digits.substring(i, i+1).matches("[^2-9]")){
            	return new LinkedList<>();
            }
        }        
        Map<Character,List<Character>> map = new HashMap<>();
        map.put('2', Arrays.asList('a','b','c'));
        map.put('3', Arrays.asList('d','e','f'));
        map.put('4', Arrays.asList('g','h','i'));
        map.put('5', Arrays.asList('j','k','l'));
        map.put('6', Arrays.asList('m','n','o'));
        map.put('7', Arrays.asList('p','q','r','s'));
        map.put('8', Arrays.asList('t','u','v'));
        map.put('9', Arrays.asList('w','x','y','z'));
        int len = digits.length();
        results.add("");
        for(int i =0;i<len;i++){
        	char digit = digits.charAt(i);
        	while(results.peek().length()==i){
        		String t = results.remove();
        		for(char s:map.get(digit)){
        			results.add(t+s);
        		}
        	}
        }
        return results;
    }
}
