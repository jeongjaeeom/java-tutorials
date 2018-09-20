package steps.step02;

import java.util.Scanner;

public class Q10430 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b, c;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    scanner.close();
    System.out.println((a + b) % c);
    System.out.println((a % c + b % c) % c);
    System.out.println((a * b) % c);
    System.out.println((a % c * b % c) % c);
  }
}
