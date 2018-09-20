package steps.step03;

import java.util.Scanner;

public class Q1924 {

  private static final String[] WEEKS = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private static final int[] LAST_DAY_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int month = scanner.nextInt();
    int day = scanner.nextInt();
    scanner.close();

    int days = 0;
    for (int i = 1; i < month; i++) {
      days += LAST_DAY_OF_MONTH[i - 1];
    }
    days += day - 1;
    System.out.println(WEEKS[days % 7]);
  }
}
