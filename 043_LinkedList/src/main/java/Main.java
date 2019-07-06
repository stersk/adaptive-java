import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(scanner.nextLine());
   LinkedList<Integer> list = new LinkedList<>();

    while (st.hasMoreTokens()){
      list.addFirst(Integer.decode(st.nextToken()));
    }

    list.removeFirst();
    list.removeFirst();
    list.removeFirst();
    list.stream().sorted().forEach(a -> System.out.println(a));

    StringBuilder sb = new StringBuilder();

  }
}

