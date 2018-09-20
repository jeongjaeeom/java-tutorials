package steps.step03;

import java.util.Scanner;

public class Q2439 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > 0; j--) {
        if (j > i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
