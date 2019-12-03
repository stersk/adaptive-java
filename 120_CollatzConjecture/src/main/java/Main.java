import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    List<Integer> result = new ArrayList<>();

    while (number != 1) {
      result.add(number);
      if (number%2 == 0) {
        number /= 2;
      } else {
        number = 3 * number + 1;
      }
    }

    result.add(1);

    System.out.println(String.join(" ", result.stream().map(a -> a.toString()).collect(Collectors.toList())));
  }
}