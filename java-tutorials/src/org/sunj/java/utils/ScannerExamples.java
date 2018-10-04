package org.sunj.java.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import org.junit.Test;

public class ScannerExamples {

  @Test
  public void testScanner() {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    sc.close();
    System.out.println(i);
  }

  @Test
  public void testScannerHasInt() {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
      int aInt = sc.nextInt();
      System.out.println(aInt);
    }
    sc.close();
  }

  @Test
  public void testScannerDelimiters() {
    String input = "1 fish 2 fish red fish blue fish";
    Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
    System.out.println(s.nextInt());
    System.out.println(s.nextInt());
    System.out.println(s.next());
    System.out.println(s.next());
    s.close();
  }

  @Test
  public void testScannerDelimitersRegEx() {
    String input = "1 fish 2 fish red fish blue fish";
    Scanner s = new Scanner(input);
    s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
    MatchResult result = s.match();
    for (int i = 1; i <= result.groupCount(); i++)
      System.out.println(result.group(i));
    s.close();
  }

  @Test
  public void testScannerToIntArray() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); // 개행 문자 인식을 위함.
    int[] intArray = new int[n];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(Arrays.toString(intArray));
    // input
    // 3
    // 22 33 44
    // output
    // [22, 33, 44]
  }

  @Test
  public void testScannerBufferedReader() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
    br.close();
  }

  @Test
  public void testMultiLineInputUsingTwoScanner() throws IOException {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextLine()) {
      List<String> tokens = new ArrayList<>();
      Scanner lineScanner = new Scanner(scanner.nextLine());

      while (lineScanner.hasNext()) {
        tokens.add(lineScanner.next());
      }

      lineScanner.close();
      System.out.println(tokens);
    }

    scanner.close();
    // input
    // A B C
    // D E
    // output
    // [A, B, C]
    // [D, E]
  }

  @Test
  public void testMultiLineInputUsingSingleScanner() throws IOException {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      String[] tokens = scanner.nextLine().split("\\s");
      System.out.println(Arrays.toString(tokens));
    }
    // input
    // A B C
    // D E
    // output
    // [A, B, C]
    // [D, E]
    scanner.close();
  }

  @Test
  public void testMultiLineInputUsingOnlyHasNext() throws IOException {
    List<String> tokens = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      tokens.add(scanner.next());
    }

    scanner.close();
    System.out.println(tokens);
    // input
    // A B C
    // D E
    // output
    // [A, B, C, D, E]
  }

  @Test
  public void testMultiLineInputBuffereder() throws IOException {
    try (InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in)) {
      String line;
      while ((line = buffer.readLine()) != null) {
        String[] tokens = line.split("\\s");
        System.out.println(Arrays.toString(tokens));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    // input
    // A B C
    // D E
    // output
    // [A, B, C, D, E]
  }

  @Test
  public void testScannerUseCase01() {
    // Declare the object and initialize with
    // predefined standard input object
    Scanner sc = new Scanner(System.in);

    // String input
    String name = sc.nextLine();

    // Character input
    char gender = sc.next().charAt(0);

    // Numerical data input
    // byte, short and float can be read
    // using similar-named functions.
    int age = sc.nextInt();
    long mobileNo = sc.nextLong();
    double cgpa = sc.nextDouble();

    sc.close();
    // Print the values to check if input was correctly obtained.
    System.out.println("Name: " + name);
    System.out.println("Gender: " + gender);
    System.out.println("Age: " + age);
    System.out.println("Mobile Number: " + mobileNo);
    System.out.println("CGPA: " + cgpa);

    // input
    // Geek
    // F
    // 40
    // 9876543210
    // 9.9
  }

  @Test
  public void testScannerUseCase02() {
    // Declare an object and initialize with
    // predefined standard input object
    Scanner sc = new Scanner(System.in);

    // Initialize sum and count of input elements
    int sum = 0, count = 0;

    // Check if an int value is available
    while (sc.hasNextInt()) {
      // Read an int value
      int num = sc.nextInt();
      sum += num;
      count++;
    }
    sc.close();
    int mean = sum / count;
    System.out.println("Mean: " + mean);
  }


}
