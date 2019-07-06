import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    String digit = scanner.nextLine();
    while (!digit.equals("0")) {
      list.add(digit);
      digit = scanner.nextLine();
    };

    int result = list.stream().mapToInt(a -> Integer.parseInt(a)).sum();
    System.out.println(result);
  }
}
