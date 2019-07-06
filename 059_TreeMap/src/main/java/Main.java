import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    NavigableMap<Integer, String> treeMap = new TreeMap<Integer, String>();
    treeMap.put(1, "one");
    treeMap.put(2, "two");
    treeMap.put(3, "three");
    treeMap.put(4, "four");
    treeMap.put(5, "five");
    treeMap.put(6, "six");
    treeMap.put(7, "seven");

    NavigableMap<Integer, String> subMap = getSubMap(treeMap);
    subMap.forEach((k,v) -> System.out.println(k + ":" + v));
  }

  public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map){
    if (map.firstEntry().getKey() % 2 != 0) {
      map = map.subMap(map.firstEntry().getKey(), true, map.firstEntry().getKey() + 4, true);
    } else {
      map = map.subMap(map.lastEntry().getKey() - 4, true, map.lastEntry().getKey(), true);
    }

    map = map.descendingMap();

   return map;
  }
}
