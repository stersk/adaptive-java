import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    ArrayDeque queue = new ArrayDeque(4);
    queue.add(2);
    queue.add(0);
    queue.add(1);
    queue.add(7);

    System.out.println(queue);
  }
}
