package steps.step04;

import java.util.Scanner;

public class Q1546 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] scores = new int[n];
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < args.length; i++) {
      scores[i] = sc.nextInt();
      if (scores[i] > max) {
        max = scores[i]; 
      }
    }
    sc.close();
    
  }

}
