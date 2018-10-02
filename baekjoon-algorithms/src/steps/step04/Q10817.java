package steps.step04;

import java.util.Scanner;

public class Q10817 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    scanner.close();

    if (a >= b) {
      if (b >= c) {
        System.out.println(b);
      } else if (c >= a) {
        System.out.println(a);
      } else {
        System.out.println(c);
      }
    } else {
      if (a >= c) {
        System.out.println(a);
      } else if (b >= c) {
        System.out.println(c);
      } else {
        System.out.println(b);
      }
    }
  }
}
