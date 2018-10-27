package steps.step04;

import java.util.Scanner;

public class Q1546 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    double[] scores = new double[n];
    double m = Double.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      scores[i] = sc.nextInt();
      if (scores[i] > m) {
        m = scores[i];
      }
    }
    sc.close();

    double sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += (scores[i] / m) * 100;
    }
    System.out.println(sum / scores.length);
  }
}
