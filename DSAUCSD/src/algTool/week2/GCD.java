package algTool.week2;

import java.util.*;

public class GCD {
  private static int gcd(int a, int b) {
	  int temp;
	  while(b!=0){
		  temp =a;
		  a=b;
		  b=temp%b;
	  }
	  return a;
  }

  public static void main(String args[]) {
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd(a, b));
  }
}
