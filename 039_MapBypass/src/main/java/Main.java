import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> map = new TreeMap<>();
    map.put("Gamma",  3);
    map.put("Omega", 24);
    map.put("Alpha",  1);
    //write your code here

    map.forEach((a,v) -> System.out.println(a + "=" + v.toString()));
  }
}
