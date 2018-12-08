package tutorials.reflect.classes;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ReflectionExamples {

  @Test
  public void recursiveField() {
    Foo foo = new Foo();
    retrieveObjectValue(foo);
  }
  
  
  
  private List<Class<? extends Object>> retrieveObjectList =
      Arrays.asList(java.lang.Boolean.class, java.lang.Character.class, java.lang.Byte.class,
          java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class,
          java.lang.Float.class, java.lang.Double.class, java.lang.String.class);


  private void retrieveObjectValue(Object obj) {
    try {
      if (obj != null) {
        for (Field field : obj.getClass().getDeclaredFields()) {
          field.setAccessible(true);
          Object _fieldObj = field.get(obj);
          if (_fieldObj != null) {
            if (isRetrieveObjectValue(_fieldObj)) {
              System.out.println(field.getName() + " = " + _fieldObj);
            } else {
              retrieveObjectValue(_fieldObj); 
            }
          }
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private boolean isRetrieveObjectValue(Object obj) {
    return retrieveObjectList.stream().anyMatch(c -> c.equals(obj.getClass()));
  }

  private static class Foo {
    private String name = "foo";
    private int age = 32;
    private Integer tall = 183;

    private Bar bar = new Bar();

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Bar getBar() {
      return bar;
    }

    public void setBar(Bar bar) {
      this.bar = bar;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public Integer getTall() {
      return tall;
    }

    public void setTall(Integer tall) {
      this.tall = tall;
    }

    @Override
    public String toString() {
      return "Foo [name=" + name + "]";
    }
  }

  private static class Bar {
    private String name = "bar";
    private Baz baz = new Baz();

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Baz getBaz() {
      return baz;
    }

    public void setBaz(Baz baz) {
      this.baz = baz;
    }

    @Override
    public String toString() {
      return "Bar [name=" + name + "]";
    }
  }

  private static class Baz {
    private String name = "baz";

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Baz [name=" + name + "]";
    }
  }

}
