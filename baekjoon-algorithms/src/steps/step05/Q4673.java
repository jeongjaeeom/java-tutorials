package steps.step05;

import java.util.ArrayList;
import java.util.List;
/*
수열을 구하는 문제가 아니다.
셀프 넘버를 구하는 문제다.
예를 들어 getDn(1)을 했을 때 1+1 해서 2가나오는데
그러므로 2는 생성자가 있다고 할 수있다.
그래서 getDn(n) 으로 했을 때 해당 값은 생성자가 있다는 뜻.
* */
public class Q4673 {
    public static final int LIMIT = 10000;

    public static void main(String[] args) {
        List<Integer> dns = new ArrayList<>();
        for (int n = 1; n <= LIMIT; n++) {
            dns.add(getDn(n));
        }

        for (int n = 1; n <= LIMIT; n++) {
            if (!dns.contains(n)) {
                System.out.println(n);
            }
        }
    }

    private static int getDn(int n) {
        int dn = n;
        while (n > 0) {
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
}
