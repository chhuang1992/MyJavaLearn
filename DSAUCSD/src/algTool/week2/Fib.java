package algTool.week2;

import java.util.Scanner;

public class Fib {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  public static void main(String args[]) {
    @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
