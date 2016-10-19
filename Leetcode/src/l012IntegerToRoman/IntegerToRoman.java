package l012IntegerToRoman;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(intToRoman(num));
		
	}
	
	public static String intToRoman(int num) {
		String[] M={"","M","MM","MMM"};
		String[] C={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] X={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] I={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String roman = M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[num%10];
		return roman;
	}

}
