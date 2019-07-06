import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    Map<Integer,Integer> numbers = new HashMap<>();
    for (int i = 0; i < number; i++){
      int currentNumber = scanner.nextInt();
      numbers.merge(currentNumber, 1, (a,b) -> a + b);
    }

    long result = numbers.values().stream().filter(a -> a > number / 3).count();
    if (result > 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}