package org.sunj.java.utils;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import org.junit.Test;

public class StringJoinerExamples {
  
  @Test
  public void testJoin() {
    List<String> srcStrings = Arrays.asList("Banana", "Orange", "Apple", "Mango");
    StringJoiner strJoiner = new StringJoiner(",");
    for (String str : srcStrings) {
      strJoiner.add(str);
    }
    assertEquals(strJoiner.toString(), "Banana,Orange,Apple,Mango");
    
    StringJoiner strJoiner2 = new StringJoiner(":", "[", "]");
    for (String str : srcStrings) {
      strJoiner2.add(str);
    }
    assertEquals(strJoiner2.toString(), "[Banana:Orange:Apple:Mango]");
  }
  
  @Test
  public void testJoinWithStream() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    String commaSeparatedNumbers = numbers.stream()
        .map(i -> i.toString())
        .collect(Collectors.joining(", "));
    assertEquals(commaSeparatedNumbers, "1, 2, 3, 4");
  }
}
