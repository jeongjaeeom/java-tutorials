package org.sunj.java.aggregate;

import java.util.Optional;
import org.junit.Test;

public class StreamExamples01 {

  @Test
  public void testFilter() {
    String str = null;
    Optional.ofNullable(str).filter((s) -> {
      System.out.println("filter: " + s);
      return true;
    }).map(String::toUpperCase);
  }

}
