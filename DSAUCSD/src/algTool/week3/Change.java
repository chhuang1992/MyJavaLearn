package algTool.week3;

import java.util.Scanner;

public class Change {

	private static int getChange(int m) {
	    //write your code here
		int num10 = m/10;
		int remainder = m%10;
		int num5 = remainder/5;
		remainder %= 5;
		m = num10+num5+remainder;
		
	    return m;
	}

	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    int m = scanner.nextInt();
	    System.out.println(getChange(m));

	}
}


