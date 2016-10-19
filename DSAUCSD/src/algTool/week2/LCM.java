package algTool.week2;

import java.util.*;

public class LCM {
  private static long lcm(int a, int b) {
    //write your code here
	  long mul = (long)a*(long)b;
	  int temp;
	  while(b!=0){
		  temp =a;
		  a=b;
		  b=temp%b;
	  }
    return mul/(long)a;
  }

  public static void main(String args[]) {
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }
}
