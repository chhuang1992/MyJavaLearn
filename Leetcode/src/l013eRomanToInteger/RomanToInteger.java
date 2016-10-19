package l013eRomanToInteger;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String roman = scanner.next();
		System.out.println(romanToInt(roman));
	}
	public static int romanToInt(String s){
		for(int i=0;i<s.length();i++){
			if(s.substring(i, i+1).matches("[^MDCLXVImdclxvi]")){
				return -1;
			}
		}
		int num=0;
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='M')  num += 1000;
			if(s.charAt(i)=='D')  num += 500;
			if(s.charAt(i)=='C')  num += 100;
			if(s.charAt(i)=='L')  num += 50;
			if(s.charAt(i)=='X')  num += 10;
			if(s.charAt(i)=='V')  num += 5;
			if(s.charAt(i)=='I')  num += 1;
		}
		if(s.indexOf("IV")!=-1)  num -= 2;
		if(s.indexOf("IX")!=-1)  num -= 2;
		if(s.indexOf("XL")!=-1)  num -= 20;
		if(s.indexOf("XC")!=-1)  num -= 20;
		if(s.indexOf("CD")!=-1)  num -= 200;
		if(s.indexOf("CM")!=-1)  num -= 200;
		return num;
	}

}
