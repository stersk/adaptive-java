import java.util.*;

public class Main {
  public static void main(String[] args) {
    /*List<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(scanner.nextLine());

    while (st.hasMoreTokens()){
      list.add(Integer.decode(st.nextToken()));
    }

    System.out.println(Collections.max(list));*/

    List<String> list = new ArrayList<>();
    list.add("hi");
    list.add("hello");
    list.add("goodmorning");
    list.add("ass");

    changeList(list);
  }

  static List<String> changeList(List<String> list){
    final String[] word = {""};
    list.forEach(a -> {
      if (a.length() > word[0].length()) {
        word[0] = a;
      }
    });

    for (int i = 0; i < list.size(); i++) {
      list.set(i, word[0]);
    }

    return list;
  }
}
