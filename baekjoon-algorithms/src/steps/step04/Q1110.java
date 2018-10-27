package steps.step04;

import java.util.Scanner;

public class Q1110 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    System.out.println(cycle(n / 10, n % 10, n));
  }

  public static int cycle(int tens, int units, int n) {
    int sum = tens + units;
    String s = String.valueOf(units) + String.valueOf(sum % 10);
    if (n == Integer.valueOf(s)) {
      return 1;
    }

    return 1 + cycle(Integer.valueOf(s) / 10, Integer.valueOf(s) % 10, n);
  }

}