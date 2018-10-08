package org.sunj.java.streams;

import java.time.chrono.IsoChronology;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
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

  @Test
  public void testListToMap() {
    List<Person> persons = Person.createRoster();
    Map<String, Person> personMap =
        persons.stream()
          .collect(Collectors.toMap(Person::getName, person -> person));
    System.out.println("persons: " + personMap);

    List<Map<String, String>> mapList =
        Stream.of(Collections.singletonMap("name", "Foo"), Collections.singletonMap("name", "Bar"))
            .collect(Collectors.toList());
    
    Map<String, Object> map = mapList.stream()
        .collect(Collectors.toMap(m -> ((Map<String, String>) m).get("name"), m -> m));
    System.out.println("map: " + map);
  }
  
  @Test
  public void testStreamUseMap() {
    List<Person> persons = null;
    System.out.println(persons);
    List<Person> personsToUseMap = Optional.ofNullable(persons).orElse(Collections.emptyList()).stream().map(p -> {
      return new Person("Test", IsoChronology.INSTANCE.date(1980, 6, 20), Person.Sex.MALE,
          "fred@example.com");
    }).collect(Collectors.toList());
    System.out.println(personsToUseMap);
  }
  
}
