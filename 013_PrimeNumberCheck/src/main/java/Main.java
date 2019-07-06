import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long number = scanner.nextLong();
    System.out.println(isPrime(number));
    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
  }

  public static boolean isPrime(final long number) {
    return (Stream.iterate(1, i -> i + 1).limit(number).filter(n -> number % n == 0).count() == 2);
  }
}
