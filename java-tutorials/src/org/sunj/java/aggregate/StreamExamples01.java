package org.sunj.java.aggregate;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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
    List<Person> persons =
        Stream.of(new Person("Foo"), new Person("Bar")).collect(Collectors.toList());
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

  static class Person {
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public LocalDate getBirthday() {
      return birthday;
    }

    public void setBirthday(LocalDate birthday) {
      this.birthday = birthday;
    }

    public Sex getGender() {
      return gender;
    }

    public void setGender(Sex gender) {
      this.gender = gender;
    }

    public String getEmailAddress() {
      return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
    }

    public enum Sex {
      MALE, FEMALE
    }
  }

}
