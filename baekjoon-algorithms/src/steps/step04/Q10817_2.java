package steps.step04;

import java.util.Arrays;
import java.util.Scanner;

public class Q10817_2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    scanner.close();

    int[] arr = {a, b, c};
    Arrays.sort(arr);
    System.out.println(arr[1]);
  }

}
