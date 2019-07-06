import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numbersCount = scanner.nextInt();
    int[] numbers = new int[numbersCount];
    for (int i = 0; i < numbersCount; i++) {
      numbers[i] = scanner.nextInt();
    }

    int max = Arrays.stream(numbers).filter(n -> n%4 == 0).max().orElse(0);
    System.out.println(max);
  }
}
