import java.util.Scanner;
import java.util.stream.IntStream;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputChar = scanner.nextInt();
    final int sum = sumDigits(inputChar);

    long result = IntStream.range(1, inputChar).filter(a -> sumDigits(a) == sum).count();
    System.out.println(result);
  }

  public static int sumDigits(int number) {
    int accumulator = 0;
    char[] cs = String.valueOf(number).toCharArray();
    for (int i = 0; i < cs.length; i++) {
      accumulator += Character.getNumericValue(cs[i]);
    }

    return accumulator;
  }
}
