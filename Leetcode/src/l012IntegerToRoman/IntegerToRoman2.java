package l012IntegerToRoman;

import java.util.Scanner;

public class IntegerToRoman2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(intToRoman(num));
		
	}
	
	public static String intToRoman(int num) {
		int[] values =  {1000,900 ,500,400 ,100,90  ,50 ,40  ,10 ,9   ,5  ,4   ,1  };
		String[] strs = {"M" ,"CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String roman = "";
		for(int i=0;i<values.length;i++){
			while(num>=values[i]){
				roman += strs[i];
				num -= values[i];				
			}
		}		
		return roman;
	}

}
