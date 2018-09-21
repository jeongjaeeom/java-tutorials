package org.sunj.algorithms.permutations;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation01 {

  private int n; // nPr의 n
  private int r; // nPr의 r
  private ArrayList<Integer> itemList;
  private int[] res;

  // 초기화
  public Permutation01(int[] intArr, int r) {
    this.r = r; // nPr의 r
    this.n = intArr.length; // nPr의 n
    this.res = new int[r]; // 결과값 배열

    // 아이템이 들어갈 리스트
    itemList = new ArrayList<Integer>();
    for (int item : intArr)
      itemList.add(item);
  }

  public void perm(int depth) {
    perm(itemList, 0);
  }

  public void perm(ArrayList<Integer> itemList, int depth) {
    // depth가 0부터 시작했을 경우 depth == r에서 리턴
    if (depth == r) {
      System.out.println(Arrays.toString(res));
      return;
    }

    for (int i = 0; i < n - depth; i++) {
      res[depth] = itemList.remove(i); // 아이템 선택 + 리스트에서 제거
      perm(itemList, depth + 1); // 재귀호출
      itemList.add(i, res[depth]); // 제거된 아이템 복원
    }
    
    /*
         중복을 허용한 코드
     for (int i = 0; i < n - depth; i++) {
      res[depth] = itemList.remove(i); // 아이템 선택 + 리스트에서 제거
      perm(itemList, depth + 1); // 재귀호출
      itemList.add(i, res[depth]); // 제거된 아이템 복원
    }
    */
  }

  public static void main(String[] args) {
    int r = 2;
    int[] arr = {1, 2, 3, 4, 5};

    Permutation01 main = new Permutation01(arr, r);
    main.perm(0);
  }

}
