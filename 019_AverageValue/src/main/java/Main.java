import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();
    while (value > 0) {
      list.add(value);
      value = scanner.nextInt();
    }

    double result = 0;
    if (list.size() > 0) {
      result = list.stream().mapToDouble(a -> (Double) a.doubleValue()).average().getAsDouble();
    };

    System.out.println(result);
  }
}
