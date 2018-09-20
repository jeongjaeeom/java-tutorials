package steps.step02;

import java.util.Scanner;

public class Q2839 {

  private static final int SMALL = 3;
  private static final int BIG = 5;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(), quotient = n / BIG, reminder = n % BIG;
    scanner.close();

    while (quotient >= 0) {
      if (reminder % SMALL == 0) {
        quotient += reminder / SMALL;
        break;
      }
      quotient--;
      reminder += BIG;
    }
    System.out.printf("%d", quotient);
  }
}
