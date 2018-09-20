package steps.step03;

import java.util.Scanner;

public class Q2742 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    for (int i = n; i >= 1; i--) {
      System.out.println(i);
    }
  }
}
