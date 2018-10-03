package steps.step04;

import java.util.Scanner;

public class Q10871 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      int k = scanner.nextInt();
      if (k < x) {
        System.out.print(k + " ");
      }
    }
    scanner.close();
  }
}
