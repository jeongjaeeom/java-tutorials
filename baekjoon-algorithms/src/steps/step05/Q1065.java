package steps.step05;

import java.util.Scanner;

public class Q1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        int[] digits = new int[3];
        for (int i = 1; i<= n; i++) {
            if (i < 100) {
                cnt++;
            } else if (i < 1000) {
                int x = i;
                int k = 0;
                while (x > 0) {
                    digits[k++] = x % 10;
                    x /= 10;
                }
                if (digits[0] - digits[1] == digits[1] - digits[2]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
