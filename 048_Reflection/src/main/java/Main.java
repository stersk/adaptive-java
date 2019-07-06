import java.lang.reflect.Type;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Type type = ComparatorInspector.getComparatorType(MyInt.class);
    System.out.println(type.getTypeName());

    Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
  }
}
