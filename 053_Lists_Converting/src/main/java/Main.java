import java.util.*;

public class Main {

  public static void main(String[] args) {

    List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

    String[] strArray = nameList.toArray(new String[nameList.size()]);

    for (int i = 0; i < strArray.length; i++) {
      System.out.println(strArray[i]);
    }
  }
}