package steps.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552 {

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // StringBuilder를 사용해도 된다.
    try {
      int n = Integer.parseInt(br.readLine());
      for (int i = 0; i < n; i++) {
        String[] strs = br.readLine().split(" ");
        bw.write(Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]) + "\n");
      }
      bw.flush();
    } catch (Exception e) {
      e.printStackTrace();
    } finally { 
      try {
        br.close();
        bw.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
