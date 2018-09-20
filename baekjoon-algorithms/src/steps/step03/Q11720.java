package steps.step03;

import java.util.Scanner;

public class Q11720 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine(); // 개행문자를 인식하기 때문에 위에 n을 입력 후 엔터를 치면 개행문자가 입력됨.
    String str = scanner.nextLine();
    scanner.close();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += str.charAt(i) - '0';
    }
    System.out.print(sum);
  }
}
