import java.util.*;

public class Main {

  public static void main(String[] args) {

    Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
    queue.add(5);

    queue.pop();
    queue.pop();

    System.out.println(queue);

  }
}