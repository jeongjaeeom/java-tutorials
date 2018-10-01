package org.sunj.java.aggregate;

import java.util.stream.Stream;
import org.junit.Test;

public class StreamExamples01 {

  @Test
  public void testFilterStartWithAStr() {
    Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
      System.out.println("filter: " + s);
      return s.startsWith("a");
    }).forEach(s -> System.out.println("forEach: " + s));
  }

  @Test
  public void testFilterAndMap() {
    Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
      System.out.println("filter: " + s);
      return s.startsWith("a");
    }).map(String::toUpperCase).forEach(s -> System.out.println("forEach: " + s));
  }

}
