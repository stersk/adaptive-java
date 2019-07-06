import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    Set<String> set = new HashSet<>();
    set.addAll(list);

    List<String> newList = new ArrayList<>();
    newList.addAll(set);
  }
}
